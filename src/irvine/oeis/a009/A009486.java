package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009486 sin(sin(x)*sin(x)) = 2/2!*x^2 - 8/4!*x^4 - 88/6!*x^6 + 6592/8!*x^8 - ...
 * @author Sean A. Irvine
 */
public class A009486 extends Sequence0 {

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
    return RING.sin(RING.pow(RING.sin(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
