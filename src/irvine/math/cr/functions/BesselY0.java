package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * The bessel Y0 function.
 * @author Sean A. Irvine
 */
class BesselY0 extends CrFunction1 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z term = z2approx;
        Z sum = term;
        Q harmonic = Q.ONE;
        long k = 1;
        while (true) {
          term = scale(term.multiply(z2approx), p).divide(++k * k);
          if (term.isZero()) {
            break;
          }
          harmonic = harmonic.add(new Q(1, k));
          sum = sum.signedAdd((k & 1) == 1, harmonic.multiply(term).toZ());
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.add(z.divide(CR.TWO).log().add(CR.GAMMA).multiply(CrFunctions.BESSEL_J0.cr(z))).multiply(CR.TWO).divide(CR.PI);
  }
}
