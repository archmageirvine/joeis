package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013373 cos(sin(x)-sinh(x))=1-40/6!*x^6-480/10!*x^10+246400/12!*x^12...
 * @author Sean A. Irvine
 */
public class A013373 extends Sequence0 {

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
    return RING.cos(RING.subtract(RING.sin(RING.x(), mN), RING.sinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
