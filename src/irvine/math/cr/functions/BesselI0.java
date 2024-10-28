package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The bessel I0 function.
 * @author Sean A. Irvine
 */
class BesselI0 extends CrFunction1 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final CR z) {
    // Expansion: Sum_{k>=0} (((z/2)^2)^k / (k!)^2.
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z term = CR.ONE.getApprox(p); // k = 0
        Z sum = term;
        long k = 0;
        while (true) {
          term = scale(term.multiply(z2approx), p).divide(++k * k);
          if (term.isZero()) {
            break;
          }
          sum = sum.add(term);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    };
  }
}
