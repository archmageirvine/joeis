package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013297 -arctan(log(x+1)-arctanh(x))=1/2!*x^2+6/4!*x^4+90/6!*x^6+2520/8!*x^8...
 * @author Sean A. Irvine
 */
public class A013297 implements Sequence {

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
    return RING.atan(RING.subtract(RING.log1p(RING.x(), mN), RING.atanh(RING.x(), mN)), mN).coeff(mN).negate().multiply(mF).toZ();
  }
}
