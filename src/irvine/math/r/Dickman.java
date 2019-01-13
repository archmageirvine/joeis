package irvine.math.r;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Dickman function.  This implementation draws from the description given in
 * "Asymptotic Semismoothness Probabilities", E. Bach &amp; R. Peralta, Math. Comp.
 * 65, 1701--1715, 1996; and from the implementation in <code>msieve</code>
 * as written by Jason Papadopoulos.
 *
 * @author Sean A. Irvine
 * @author Jason Papadopoulos
 */
public final class Dickman {

  private Dickman() { }

  // After Bach & Peralta 55 terms is enough for IEEE double arithmetic
  private static final int MAX_COEFFS = 55;
  private static final double DICKMAN_ACCURACY = 1.0e-8;

  private static final ArrayList<double[]> COEFFS = new ArrayList<>();

  private static void coeff0() {
    COEFFS.add(null);
  }

  private static void coeff1() {
    // dickman(x) is 1.0 for x <= 1
    final double[] coeffs = new double[MAX_COEFFS];
    coeffs[0] = 1;
    COEFFS.add(coeffs);
  }

  private static void coeff2() {
    // for x <= 2 the value of dickman(x) is known explicitly
    final double[] coeffs = new double[MAX_COEFFS];
    coeffs[0] = 1.0 - Constants.LN2;
    double t = 0.5;
    for (int k = 1; k < MAX_COEFFS; ++k, t *= 0.5) {
      coeffs[k] = t / k;
    }
    COEFFS.add(coeffs);
  }

  private static double[] coeffs(final int arg) {
    if (COEFFS.isEmpty()) {
      coeff0();
    }
    if (COEFFS.size() == 1) {
      coeff1();
    }
    if (COEFFS.size() == 2) {
      coeff2();
    }
    // proceed with the rest of the integer aguments to dickman(x)
    for (int i = COEFFS.size(); i <= arg; ++i) {
      final double[] coeffs = Arrays.copyOf(COEFFS.get(i - 1), MAX_COEFFS);
      final double recip = 1.0 / i;
      // derive the coefficients for dickman(x) from those used in dickman(x-1)
      double sum = 0;
      for (int j = MAX_COEFFS - 1; j > 0; --j) {
        double s = 0;
        double t = recip / j;
        for (int k = j - 1; k >= 0; --k) {
          s += t * coeffs[k];
          t *= recip;
        }
        coeffs[j] = s;
        sum += s / (j + 1);
      }
      coeffs[0] = sum / (i - 1);
      COEFFS.add(coeffs);
    }
    return COEFFS.get(arg);
  }

  /**
   * Compute the Dickman rho function at a particular value.
   * @param arg parameter
   * @return Dickman rho function
   */
  public static double dickman(final double arg) {
    if (arg <= 1) {
      return 1;
    }

    final double intArg = Math.ceil(arg);
    final double fracArg = intArg - arg;
    final double[] coeffs = coeffs((int) intArg);

    double sum = coeffs[0];
    double term = fracArg;

    for (int k = 1; k < coeffs.length; ++k) {
      final double t = term * coeffs[k];
      sum += t;
      if (t < sum * 0.5 * DICKMAN_ACCURACY) {
        break;
      }
      term *= fracArg;
    }
    return sum;
  }

  /**
   * Compute the Dickman rho function of given argument.
   * @param args parameter
   */
  public static void main(final String[] args) {
    System.out.println(dickman(Double.parseDouble(args[0])));
  }
}
