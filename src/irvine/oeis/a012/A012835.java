package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012835 arctan(sec(x)*tanh(x))=x-1/3!*x^3+25/5!*x^5-761/7!*x^7+42065/9!*x^9...
 * @author Sean A. Irvine
 */
public class A012835 extends Sequence0 {

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
    return RING.atan(RING.multiply(RING.sec(RING.x(), mN), RING.tanh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
