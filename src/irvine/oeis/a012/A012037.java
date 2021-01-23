package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012037 arctan(sin(arcsinh(x)))=x-4/3!*x^3+84/5!*x^5-4320/7!*x^7+410640/9!*x^9...
 * @author Sean A. Irvine
 */
public class A012037 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.atan(RING.sin(RING.asinh(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
