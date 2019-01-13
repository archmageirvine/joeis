package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Implements the Pollard rho factoring method.
 *
 * @author Sean A. Irvine
 */
public class PollardRho extends AbstractFactorizer {

  /** Number of iterations to perform per GCD operation */
  private static final int ITERATIONS_PER_GCD = 20;
  /** Outer iterations to perform */
  private static final int OUTER_ITERATIONS = 10000;

  /**
   * Attempt to find a factor of <code>n</code> by the Pollard rho method
   * using the polynomial <code><i>x</i><sup>2</sup>+<i>r</i></code>.
   *
   * @param n number to factor
   * @param r constant term of polynomial
   * @param count how long should we attempt to factor for
   * @return factor or null if no factor is found
   */
  private Z pollard(final Z n, final long r, final long count) {

    final Z rr = Z.valueOf(r);
    Z y = Z.TWO;
    Z x = Z.TWO;
    Z x1 = Z.TWO;
    Z p = Z.ONE;
    int k = 1;
    int l = 1;
    int c = 0;

    for (int jj = 0; jj < count; ++jj) {
      x = x.multiply(x).add(rr).mod(n);
      p = p.multiply(x1.subtract(x)).mod(n);
      c += 1;
      final boolean kWasZero = --k == 0;
      if (kWasZero || c == ITERATIONS_PER_GCD) {
        Z g = p.gcd(n);
        if (g.compareTo(Z.ONE) > 0) {
          // we have found a factor
          do {
            y = y.multiply(y).add(rr).mod(n);
            g = x1.subtract(y).gcd(n);
          } while (g.equals(Z.ONE));
          return g.equals(n) ? null : g; // test g<N
        } else {
          if (kWasZero) {
            x1 = x;
            k = l;
            l <<= 1;
            for (int j = 0; j < k; ++j) {
              x = x.multiply(x).add(rr).mod(n);
            }
          }

          y = x;
          c = 0;
        }
      }
    }
    return null; // no factor found in specified number of iterations
  }


  @Override
  protected void factor(final FactorSequence fs, Z n) {

    final int exponent = fs.getExponent(n);
    //    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE)) {
      return;
    }

    for (int i = -1; i < 10; ++i) {
      if (i == 0) {
        continue;
      }
      final Z f = pollard(n, i, OUTER_ITERATIONS);
      if (f != null) {
        fs.add(f, exponent);
        fs.add(n.divide(f), exponent);
        return;
      }
    }
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {

    if (args.length == 0) {
      System.out.println("USAGE: PollardRho n*");
    } else {
      final Factorizer f = new PollardRho();
      for (final String arg : args) {
        System.out.println("Trying: " + arg);
        try {
          final FactorSequence fs = new FactorSequence(new Z(arg));
          f.factor(fs);
          System.out.println(fs.toString());
        } catch (final NumberFormatException e) {
          System.out.println("Could not parse " + arg + " as a number.");
        }
      }
    }
  }

}
