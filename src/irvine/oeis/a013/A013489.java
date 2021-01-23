package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013489 exp(sinh(x)-arcsinh(x))=1+2/3!*x^3-8/5!*x^5+40/6!*x^6+226/7!*x^7...
 * @author Sean A. Irvine
 */
public class A013489 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.subtract(RING.sinh(RING.x(), mN), RING.asinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
