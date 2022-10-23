package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012422 arcsin(arctan(x)*sin(x))=2/2!*x^2-12/4!*x^4+310/6!*x^6-17304/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012422 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.asin(RING.multiply(RING.atan(RING.x(), mN), RING.sin(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
