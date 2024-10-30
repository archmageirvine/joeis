package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * The Neville <code>theta_c</code> function.
 * @author Sean A. Irvine
 */
class NevilleThetaC extends CrFunction2Cr {

  private static final int EXTRA_PRECISION = 3;
  private static final CR SQRT_2PI = CR.TAU.sqrt();

  @Override
  public CR cr(final CR z, final CR m) {
    final CR km = CrFunctions.ELLIPTIC_K.cr(m.sqrt());
    final CR qm = CrFunctions.ELLIPTIC_K.cr(CR.ONE.subtract(m).sqrt()).divide(km).multiply(CR.PI).negate().exp();
    final CR a = SQRT_2PI.multiply(qm.pow(Q.ONE_QUARTER)).divide(m.pow(Q.ONE_QUARTER).multiply(km.sqrt()));
    final CR s = CR.PI.multiply(z).divide(km.multiply(2));
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          ++k;
          final Z t = qm.pow(k * (k + 1)).getApprox(p);
          if (t.isZero()) {
            return scale(sum, -EXTRA_PRECISION);
          }
          final Z u = scale(t.multiply(s.multiply(2 * k + 1).cos().getApprox(p)), p);
          sum = sum.add(u);
        }
      }
    }.multiply(a);
  }
}
