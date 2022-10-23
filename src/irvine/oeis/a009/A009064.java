package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009064 Expansion of e.g.f. cos(sinh(x)/cos(x)), even powers only.
 * @author Sean A. Irvine
 */
public class A009064 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.cos(RING.series(RING.sinh(RING.x(), mN), RING.cos(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
