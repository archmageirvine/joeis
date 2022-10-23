package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012004 arcsinh(log(cos(x)))=-1/2!*x^2-2/4!*x^4-1/6!*x^6+148/8!*x^8-61/10!*x^10...
 * @author Sean A. Irvine
 */
public class A012004 extends Sequence0 {

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
    return RING.asinh(RING.log(RING.cos(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
