package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013361 sin(sin(x)-arctan(x))=1/3!*x^3-23/5!*x^5+719/7!*x^7-40599/9!*x^9...
 * @author Sean A. Irvine
 */
public class A013361 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sin(RING.subtract(RING.sin(RING.x(), mN), RING.atan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
