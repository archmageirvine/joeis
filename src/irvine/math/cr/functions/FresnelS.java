package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Fresnel sine function.
 * Matches the Maple and Mathematica definition of this function.
 * @author Sean A. Irvine
 */
class FresnelS extends CrFunction1 {

  private static final CR SC1 = CR.HALF_PI.sqrt();
  private static final CR SC2 = SC1.inverse();

  @Override
  public CR cr(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int p) {
        if (p >= 1) {
          return Z.ZERO;
        }
        final CR v = z.multiply(SC1);
        final Z x4 = v.pow(4).getApprox(p);
        Z t = v.pow(3).getApprox(p);
        Z sum = t.divide(3);
        long k = 0;
        while (t.abs().compareTo(Z.ONE) >= 0) {
          t = scale(t.multiply(x4), p);
          t = t.divide(2 * ++k).divide(2 * k + 1);
          sum = sum.signedAdd((k & 1) == 0, t.divide(4 * k + 3));
        }
        return sum;
      }
    }.divide(SC1);
  }
}
