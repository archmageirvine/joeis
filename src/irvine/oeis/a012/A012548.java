package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012548 Expansion of e.g.f. arctan(sinh(x)*tan(x)) (even powers only).
 * @author Sean A. Irvine
 */
public class A012548 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.atan(RING.multiply(RING.sinh(RING.x(), mN), RING.tan(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
