package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012088 arcsin(arcsin(arctan(x)))=x+12/5!*x^5-88/7!*x^7+13968/9!*x^9...
 * @author Sean A. Irvine
 */
public class A012088 implements Sequence {

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
    return RING.asin(RING.asin(RING.atan(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
