package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012351 sech(arcsin(x)*arcsin(x))=1-12/4!*x^4-240/6!*x^6-1008/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012351 implements Sequence {

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
    return RING.sech(RING.pow(RING.asin(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
