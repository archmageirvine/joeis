package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012770 -log(cosh(x)*cos(x))=-4/4!*x^4-544/8!*x^8-707584/12!*x^12...
 * @author Sean A. Irvine
 */
public class A012770 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.valueOf(24);

  @Override
  public Z next() {
    mN += 4;
    if (mN == 4) {
      return Z.FOUR;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.log(RING.multiply(RING.cosh(RING.x(), mN), RING.cos(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ().negate();
  }
}
