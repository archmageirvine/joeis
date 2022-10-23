package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013433 -arctan(arcsin(x)-arctanh(x))=1/3!*x^3+15/5!*x^5+495/7!*x^7+28735/9!*x^9...
 * @author Sean A. Irvine
 */
public class A013433 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.atan(RING.subtract(RING.atanh(RING.x(), mN), RING.asin(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
