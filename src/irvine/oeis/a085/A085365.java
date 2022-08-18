package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085365 Decimal expansion of the Kepler-Bouwkamp or polygon-inscribing constant.
 * @author Sean A. Irvine
 */
public class A085365 extends DecimalExpansionSequence {

  /** The Kepler-Bouwcamp or polygon-inscribing constant. */
  public static final CR KEPLER_BOUWKAMP = new CR() {
    @Override
    protected Z approximate(final int precision) {
      Z sum = Z.ZERO;
      int k = 0;
      while (true) {
        final CR z = Zeta.zeta(2 * ++k);
        final Z s = Z.ONE.shiftLeft(2 * k);
        final CR u = z.multiply(z.subtract(CR.valueOf(new Q(s.add(1), s)))).multiply(s.subtract(1)).divide(CR.valueOf(k));
        final Z v = u.getApprox(precision);
        if (v.isZero()) {
          break;
        }
        sum = sum.subtract(v);
      }
      return sum;
    }
  }.exp();

  /** Construct the sequence. */
  public A085365() {
    super(0, KEPLER_BOUWKAMP);
  }
}

