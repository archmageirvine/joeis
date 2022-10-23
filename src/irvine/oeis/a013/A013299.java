package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013299 -sinh(log(x+1)-arctanh(x)) = 1/2!*x^2 + 6/4!*x^4 + 135/6!*x^6 + 6300/8!*x^8 + ...
 * @author Sean A. Irvine
 */
public class A013299 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sinh(RING.subtract(RING.log1p(RING.x(), mN), RING.atanh(RING.x(), mN)), mN).coeff(mN).negate().multiply(mF).toZ();
  }
}
