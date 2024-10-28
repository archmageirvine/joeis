package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * The bessel I function.
 * @author Sean A. Irvine
 */
class BesselI extends CrFunction2 {

  private static final int EXTRA_PRECISION = 3;

  // Note: it would be straight-forward to generalize this to CR v
  @Override
  public CR cr(final int v, final CR z) {
    if (v == 0) {
      return CrFunctions.BESSEL_I0.cr(z);
    }
    // Expansion: (z/2)^v * Sum_{k>=0} (((z/2)^2)^k / (k! * (v+k+1)!).
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z term = CR.ONE.getApprox(p).divide(Functions.FACTORIAL.z(v)); // k = 0
        Z sum = term;
        long k = 0;
        while (true) {
          term = scale(term.multiply(z2approx), p).divide(++k).divide(v + k);
          if (term.isZero()) {
            break;
          }
          sum = sum.add(term);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.multiply(z.divide(CR.TWO).pow(v));
  }
}
