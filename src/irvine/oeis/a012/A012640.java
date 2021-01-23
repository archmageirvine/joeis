package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012640 arcsinh(arcsinh(x)*cos(x))=x-5/3!*x^3+73/5!*x^5-3565/7!*x^7...
 * @author Sean A. Irvine
 */
public class A012640 implements Sequence {

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
    return RING.asinh(RING.multiply(RING.asinh(RING.x(), mN), RING.cos(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
