package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013291 Expansion of e.g.f.: cosh(log(x+1)-tanh(x))=1+3/4!*x^4-40/5!*x^5+250/6!*x^6-1008/7!*x^7...
 * @author Sean A. Irvine
 */
public class A013291 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.cosh(RING.subtract(RING.log1p(RING.x(), mN), RING.tanh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
