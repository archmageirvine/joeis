package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Elliptic functions.
 * @author Sean A. Irvine
 */
public final class Elliptic {

  private Elliptic() { }

  private static final int EXTRA_PRECISION = 3;

  static CR ellipticK(final CR z) {
    return CR.HALF_PI.divide(CR.ONE.agm(CR.ONE.subtract(z.square()).sqrt()));
  }

  static CR ellipticE(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.square().getApprox(p);
        Z term = CR.ONE.getApprox(p);
        Z sum = term;
        long k = 0;
        while (true) {
          ++k;
          term = scale(term.multiply(z2approx), p).multiply((2 * k - 1) * (2 * k - 1)).divide(4 * k * k);
          if (term.isZero()) {
            break;
          }
          sum = sum.subtract(term.divide(2 * k - 1));
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.multiply(CR.HALF_PI);
  }
}
