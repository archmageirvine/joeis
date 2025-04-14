package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Thomson ber function.
 * @author Sean A. Irvine
 */
class ThomsonBer extends CrFunction1 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z x = z.pow(4).divide(CR.valueOf(16)).getApprox(p);
        Z term = CR.ONE.getApprox(p);
        Z sum = term;
        long k = 0;
        while (true) {
          term = scale(term.multiply(x), p).divide(Z.valueOf(2 * ++k).multiply(2 * k - 1).square());
          if (term.isZero()) {
            break;
          }
          sum = sum.signedAdd((k & 1) == 0, term);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    };
  }
}
