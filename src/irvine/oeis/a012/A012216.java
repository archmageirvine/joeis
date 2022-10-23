package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012216 sinh(arctan(arcsinh(x)))=x-2/3!*x^3+24/5!*x^5-664/7!*x^7+28416/9!*x^9...
 * @author Sean A. Irvine
 */
public class A012216 extends Sequence0 {

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
    return RING.sinh(RING.atan(RING.asinh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
