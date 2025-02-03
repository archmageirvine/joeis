package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * The hyperbolic sine integral function, <code>Shi(z)</code>.
 * @author Sean A. Irvine
 */
class HyperbolicSineIntegral extends CrFunction1 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        Z xk = z.getApprox(p);
        final Z x2 = z.square().getApprox(p);
        Z sum = xk;
        long k = 0;
        while (true) {
          ++k;
          xk = xk.multiply(x2).shiftRight(-p);
          final Z t = xk.divide(Functions.FACTORIAL.z(2 * k)).divide(2 * k + 1).divide(2 * k + 1);
          if (t.isZero()) {
            return scale(sum, -EXTRA_PRECISION);
          }
          sum = sum.add(t);
        }
      }
    };
  }
}
