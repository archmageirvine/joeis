package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012686 sec(tanh(x)*arctan(x))=1+12/4!*x^4-480/6!*x^6+35280/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012686 extends Sequence0 {

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
    return RING.sec(RING.multiply(RING.tanh(RING.x(), mN), RING.atan(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
