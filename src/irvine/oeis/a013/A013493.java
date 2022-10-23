package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013493 exp(arcsinh(x)-tanh(x))=1+1/3!*x^3-7/5!*x^5+10/6!*x^6+47/7!*x^7...
 * @author Sean A. Irvine
 */
public class A013493 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.subtract(RING.asinh(RING.x(), mN), RING.tanh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
