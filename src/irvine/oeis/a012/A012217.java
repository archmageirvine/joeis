package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012217 arcsinh(arctan(arcsinh(x)))=x-4/3!*x^3+92/5!*x^5-5216/7!*x^7...
 * @author Sean A. Irvine
 */
public class A012217 extends Sequence0 {

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
    return RING.asinh(RING.atan(RING.asinh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
