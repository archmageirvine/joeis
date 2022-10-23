package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012449 sinh(arctan(x)*tan(x))=2/2!*x^2+280/6!*x^6-2688/8!*x^8+774688/10!*x^10...
 * @author Sean A. Irvine
 */
public class A012449 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sinh(RING.multiply(RING.atan(RING.x(), mN), RING.tan(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
