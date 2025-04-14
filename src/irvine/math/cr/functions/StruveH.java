package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * The Struve H function.
 * @author Sean A. Irvine
 */
class StruveH extends CrFunction2 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final int v, final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final CR halfZ = z.divide(2);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          ++k;
          final CR num = halfZ.pow(2 * k + v + 1);
          final CR den = CrFunctions.GAMMA.cr(CR.valueOf(new Q(2 * k + 3, 2))).multiply(CrFunctions.GAMMA.cr(CR.valueOf(new Q(2 * (v + k) + 3, 2))));
          final Z t = num.divide(den).getApprox(p);
          if (t.isZero()) {
            return sum.shiftRight(EXTRA_PRECISION);
          }
          sum = sum.signedAdd((k & 1) == 0, t);
        }
      }
    };
  }
}
