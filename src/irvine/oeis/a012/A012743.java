package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012743 cos(arctanh(x)*cos(x))=1-1/2!*x^2+5/4!*x^4-85/6!*x^6-887/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012743 extends Sequence0 {

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
    return RING.cos(RING.multiply(RING.atanh(RING.x(), mN), RING.cos(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
