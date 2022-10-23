package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013354 arctan(sin(x)-tan(x))=-3/3!*x^3-15/5!*x^5-273/7!*x^7+7185/9!*x^9...
 * @author Sean A. Irvine
 */
public class A013354 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.atan(RING.subtract(RING.sin(RING.x(), mN), RING.tan(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
