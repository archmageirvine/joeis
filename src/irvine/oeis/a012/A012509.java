package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012509 E.g.f.: -log(cos(x)*cos(x)) (even powers only).
 * @author Sean A. Irvine
 */
public class A012509 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.log(RING.pow(RING.cos(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ().negate();
  }
}
