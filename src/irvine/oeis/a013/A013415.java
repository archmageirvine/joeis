package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013415 sech(arcsin(x)-arctan(x))=1-90/6!*x^6+2520/8!*x^8-368550/10!*x^10...
 * @author Sean A. Irvine
 */
public class A013415 extends Sequence0 {

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
    return RING.sech(RING.subtract(RING.asin(RING.x(), mN), RING.atan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
