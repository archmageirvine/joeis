package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Fresnel cosine function.
 * Matches the Maple and Mathematica definition of this function.
 * @author Sean A. Irvine
 */
class FresnelC extends CrFunction1 {

  private static final CR SC1 = CR.HALF_PI.sqrt();

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
        Z t = v.getApprox(p);
        Z sum = t;
        long k = 0;
        while (t.abs().compareTo(Z.ONE) >= 0) {
          t = scale(t.multiply(x4), p);
          t = t.divide(2 * ++k).divide(2 * k - 1);
          sum = sum.signedAdd((k & 1) == 0, t.divide(4 * k + 1));
        }
        return sum;
      }
    }.divide(SC1);
  }
}
