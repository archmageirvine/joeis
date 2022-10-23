package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012106 tanh(arcsin(sinh(x)))=x-4/5!*x^5+80/7!*x^7+5456/9!*x^9+511360/11!*x^11...
 * @author Sean A. Irvine
 */
public class A012106 extends Sequence0 {

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
    return RING.tanh(RING.asin(RING.sinh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
