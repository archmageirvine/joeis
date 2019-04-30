package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012243 <code>-log(cos(arctanh(x)))=1/2!*x^2+10/4!*x^4+280/6!*x^6+15440/8!*x^8</code>...
 * @author Sean A. Irvine
 */
public class A012243 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.log(RING.cos(RING.atanh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ().negate();
  }
}
