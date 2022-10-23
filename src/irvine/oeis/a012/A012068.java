package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012068 sinh(arcsin(arcsin(x)))=x+3/3!*x^3+49/5!*x^5+1963/7!*x^7+146017/9!*x^9...
 * @author Sean A. Irvine
 */
public class A012068 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sinh(RING.asin(RING.asin(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
