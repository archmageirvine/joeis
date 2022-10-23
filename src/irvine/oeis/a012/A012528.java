package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012528 sinh(sinh(x)*sin(x))=2/2!*x^2+112/6!*x^6+10112/10!*x^10...
 * @author Sean A. Irvine
 */
public class A012528 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 2) {
      return Z.TWO;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.sinh(RING.multiply(RING.sinh(RING.x(), mN), RING.sin(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
