package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * The hyperbolic cosine integral function, <code>Ci(z)</code>.
 * @author Sean A. Irvine
 */
class HyperbolicCosineIntegral extends CrFunction1 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z x2 = z.square().getApprox(p);
        Z sum = Z.ZERO;
        Z xk = CR.ONE.getApprox(p);
        long k = 0;
        while (true) {
          ++k;
          xk = xk.multiply(x2).shiftRight(-p);
          final Z t = xk.divide(Functions.FACTORIAL.z(2 * k)).divide(2 * k);
          if (t.isZero()) {
            return scale(sum, -EXTRA_PRECISION);
          }
          sum = sum.add(t);
        }
      }
    }.add(z.log()).add(CR.GAMMA);
  }
}
