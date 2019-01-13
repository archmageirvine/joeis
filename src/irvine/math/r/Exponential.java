package irvine.math.r;

import static irvine.math.r.Constants.EULER;
import static irvine.math.r.Constants.MACHINE_PRECISION;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.abs;
import static java.lang.Math.exp;
import static java.lang.Math.log;
import static java.lang.Math.pow;

/**
 * Exponential functions.
 *
 * @author Sean A. Irvine
 */
public final class Exponential {

  private Exponential() { }

  private static final double EIBIG = 1.44115188075855872E17;

  /**
   * Compute the exponential integral function given by
   * <code>E_n(x)=\int_1^\infty{e^{-xt}/t^n}dt</code>.
   *
   * <pre>
   *                 inf.
   *                   -
   *                  | |   -xt
   *                  |    e
   *      E (x)  =    |    ----  dt.
   *       n          |      n
   *                | |     t
   *                 -
   *                  1
   * </pre>
   *
   * Returns NaN for n &lt; 0 or x &lt; 0.
   *
   * @param n parameter
   * @param x parameter
   * @return E_n(x)
   */
  public static double e(final int n, final double x) {
    if (n < 0) { // || x < 0) {
      return NaN;
    }
    if (x > Constants.MAXLOG) {
      return 0;
    }
    if (x == 0) {
      return n < 2 ? POSITIVE_INFINITY : 1 / (double) (n - 1);
    }
    if (n == 0) {
      return exp(-x) / x;
    }
    final double nn = (double) n;
    // expansion for large n
    if (n > 5000) {
      final double xk = x + nn;
      final double yk = 1 / (xk * xk);
      return (yk * (yk * (yk * nn * (6 * x * x - 8 * nn * x + nn * nn) + nn * (nn - 2 * x)) + nn) + 1) * exp(-x) / xk;
    }

    // continued fraction expansion
    if (x > 1) {
      double pkm2 = 1;
      double qkm2 = x;
      double pkm1 = 1;
      double qkm1 = x + nn;
      int k = 1;
      double t, z = pkm1 / qkm1;
      do {
        final double yk;
        double xk;
        if ((++k & 1) == 1) {
          yk = 1;
          xk = (double) (n + (k - 1) / 2);
        } else {
          yk = x;
          xk = (double) (k >>> 1);
        }
        final double pk = pkm1 * yk + pkm2 * xk;
        final double qk = qkm1 * yk + qkm2 * xk;
        xk = pk / qk;
        t = abs((z - xk) / xk);
        z = xk;
        pkm2 = pkm1;
        pkm1 = pk;
        qkm2 = qkm1;
        qkm1 = qk;
        if (abs(pk) > EIBIG) {
          pkm2 /= EIBIG;
          pkm1 /= EIBIG;
          qkm2 /= EIBIG;
          qkm1 /= EIBIG;
        }
      } while (t > MACHINE_PRECISION);

      return z * exp(-x);
    }
    // power series expansion
    double xk = 0;
    double yk = 1;
    double pk = 1 - nn;
    double t = n == 1 ? 0 : 1 / pk;
    final double z = -x;
    do {
      yk *= z / ++xk;
      if (++pk != 0) {
        t += yk / pk;
      }
    } while ((t == 0 ? 1 : abs(yk / t)) > MACHINE_PRECISION);
    xk = -EULER - log(Math.abs(x));
    for (int k = 1; k < n; ++k) {
      xk += 1 / (double) k;
    }
    return (pow(z, n - 1) * xk / Gamma.gamma(nn)) - t;
  }

  /**
   * Compute the <code>Ei(x)=-\int_{-x}^\infty e^{-t}/t dt</code>.
   *
   * @param x parameter
   * @return <code>Ei(x)</code>
   */
  public static double ei(final double x) {
    return -e(1, -x);
  }

}
