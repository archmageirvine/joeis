package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.cr.Psi;
import irvine.math.z.Z;

/**
 * The bessel K0 function.
 * @author Sean A. Irvine
 */
class BesselK0 extends CrFunction1 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final CR z) {
    // Expansion: -ln(z/2) * I_0(z) + Sum_{k>=0} (z^(2k) / (2^(2k)*(k!)^2)) * psi(k+1)
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z sum = Psi.psi(1).getApprox(p); // k = 0
        Z term = scale(Z.ONE, -p);
        int k = 0;
        while (!term.isZero()) {
          term = scale(term.multiply(z2approx), p).divide(++k * (long) k);
          final Z t = scale(term.multiply(Psi.psi(k + 1).getApprox(p)), p);
          sum = sum.add(t);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.subtract(CrFunctions.BESSEL_I0.cr(z).multiply(z.divide(CR.TWO).log()));
  }
}
