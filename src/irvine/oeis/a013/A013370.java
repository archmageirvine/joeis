package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013370 sin(sin(x)-sinh(x))=-2/3!*x^3-2/7!*x^7+2240/9!*x^9-2/11!*x^11...
 * @author Sean A. Irvine
 */
public class A013370 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sin(RING.subtract(RING.sin(RING.x(), mN), RING.sinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
