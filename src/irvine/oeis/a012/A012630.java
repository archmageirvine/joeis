package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012630 arctanh(arcsinh(x)*arctan(x))=2/2!*x^2-12/4!*x^4+478/6!*x^6-30072/8!*x^8...
 * @author Sean A. Irvine
 */
public class A012630 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.atanh(RING.multiply(RING.asinh(RING.x(), mN), RING.atan(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
