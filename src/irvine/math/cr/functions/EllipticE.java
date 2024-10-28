package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The elliptic E function.
 * @author Sean A. Irvine
 */
class EllipticE extends CrFunction1 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final CR z) {
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
