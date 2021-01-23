package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012342 tan(arcsin(x)*arcsin(x))=2/2!*x^2+8/4!*x^4+368/6!*x^6+18048/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012342 implements Sequence {

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
    return RING.tan(RING.pow(RING.asin(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
