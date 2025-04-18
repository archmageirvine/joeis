package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * The Anger J function.
 * @author Sean A. Irvine
 */
class AngerJ extends CrFunction2Cr {

  private static final int EXTRA_PRECISION = 3;

  static CR sum1(final CR v, final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final CR halfZ = z.divide(2);
        final CR halfV = v.divide(2);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          ++k;
          final CR num = halfZ.pow(2 * k);
          final CR den = CrFunctions.GAMMA.cr(halfV.add(k + 1)).multiply(CrFunctions.GAMMA.cr(halfV.negate().add(k + 1)));
          final Z t = num.divide(den).getApprox(p);
          if (t.isZero()) {
            return sum.shiftRight(EXTRA_PRECISION);
          }
          sum = sum.signedAdd((k & 1) == 0, t);
        }
      }
    };
  }

  static CR sum2(final CR v, final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final CR halfZ = z.divide(2);
        final CR halfV = v.divide(2);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          ++k;
          final CR num = halfZ.pow(2 * k + 1);
          final CR den = CrFunctions.GAMMA.cr(halfV.add(new Q(2 * k + 3, 2))).multiply(CrFunctions.GAMMA.cr(halfV.negate().add(new Q(2 * k + 3, 2))));
          final Z t = num.divide(den).getApprox(p);
          if (t.isZero()) {
            return sum.shiftRight(EXTRA_PRECISION);
          }
          sum = sum.signedAdd((k & 1) == 0, t);
        }
      }
    };
  }

  @Override
  public CR cr(final CR v, final CR z) {
    final CR a = CR.HALF_PI.multiply(v);
    return sum1(v, z).multiply(a.cos())
      .add(sum2(v, z).multiply(a.sin()));
  }
}
