package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003701 Expansion of e.g.f. exp(x)/cos(x).
 * @author Sean A. Irvine
 */
public class A003701 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> gf = RING.series(RING.exp(RING.x(), mN), RING.cos(RING.x(), mN), mN);
    return gf.coeff(mN).multiply(mF).toZ();
  }
}
