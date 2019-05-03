package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012144 <code>sec(arcsin(arctanh(x)))=1+1/2!*x^2+17/4!*x^4+769/6!*x^6+66849/8!*x^8..</code>.
 * @author Sean A. Irvine
 */
public class A012144 implements Sequence {

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
    return RING.sec(RING.asin(RING.atanh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
