package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Psi;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * The bessel K function.
 * @author Sean A. Irvine
 */
class BesselK extends CrFunction2 {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final int v, final CR z) {
    if (v == 0) {
      return CrFunctions.BESSEL_K0.cr(z);
    }

    final CR z2f = z.multiply(z).divide(CR.FOUR);
    final CR z2fn = z2f.negate();
    CR sum1 = CR.ZERO;
    CR zp = CR.ONE;
    for (int k = 0; k < v; ++k, zp = zp.multiply(z2fn)) {
      sum1 = sum1.add(zp.multiply(Functions.FACTORIAL.z(v - k - 1)).divide(CR.valueOf(Functions.FACTORIAL.z(k))));
    }
    sum1 = sum1.multiply(CR.HALF).multiply(CR.TWO.divide(z).pow(v));

    final CR sum2 = new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z2f.getApprox(p);
        Z sum = Psi.psi(1).add(Psi.psi(v + 1)).getApprox(p).divide(Functions.FACTORIAL.z(v)); // k = 0
        Z term = scale(Z.ONE, -p).divide(Functions.FACTORIAL.z(v));
        int k = 0;
        while (!term.isZero()) {
          term = scale(term.multiply(z2approx), p).divide(++k).divide(v + k);
          final Z t = scale(term.multiply(Psi.psi(k + 1).add(Psi.psi(v + k + 1)).getApprox(p)), p);
          sum = sum.add(t);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.multiply(CR.HALF).multiply(z.divide(CR.TWO).pow(v));

    return ComputableReals.SINGLETON.signedAdd((v & 1) == 0,
      ComputableReals.SINGLETON.signedAdd((v & 1) == 1,
        sum1, CrFunctions.BESSEL_I.cr(v, z).multiply(z.divide(CR.TWO).log())),
      sum2);
  }
}
