package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012121 sec(arcsin(arcsinh(x)))=1+1/2!*x^2+5/4!*x^4+109/6!*x^6+3177/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012121 implements Sequence {

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
    return RING.sec(RING.asin(RING.asinh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
