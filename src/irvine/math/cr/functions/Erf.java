package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The error function.
 * @author Sean A. Irvine
 */
class Erf extends CrFunction1 {

  private static final CR ERF_C1 = CR.TWO.divide(CR.SQRT_PI);

  @Override
  public CR cr(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int p) {
        if (p >= 1) {
          return Z.ZERO;
        }
        final Z x2 = z.square().getApprox(p);
        Z t = z.getApprox(p);
        Z sum = t;
        long k = 0;
        while (t.abs().compareTo(Z.ONE) >= 0) {
          t = scale(t.multiply(x2), p);
          t = t.divide(++k);
          sum = sum.signedAdd((k & 1) == 0, t.divide(2L * k + 1));
        }
        return sum;
      }
    }.multiply(ERF_C1);
  }
}
