package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012127 sinh(arcsin(tanh(x)))=x-4/5!*x^5+80/7!*x^7-2224/9!*x^9+88960/11!*x^11...
 * @author Sean A. Irvine
 */
public class A012127 extends Sequence0 {

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
    return RING.sinh(RING.asin(RING.tanh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
