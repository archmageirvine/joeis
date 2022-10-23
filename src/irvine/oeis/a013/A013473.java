package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013473 arctan(cos(x)-cosh(x))=238/6!*x^6-715682/10!*x^10+12212600398/14!*x^14...
 * @author Sean A. Irvine
 */
public class A013473 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 2) {
      return Z.valueOf(-2);
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.atan(RING.subtract(RING.cos(RING.x(), mN), RING.cosh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
