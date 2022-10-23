package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013327 Expansion of e.g.f.: exp(exp(x)-sec(x))=1+x+1/2!*x^2+2/3!*x^3+1/4!*x^4-8/5!*x^5...
 * @author Sean A. Irvine
 */
public class A013327 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.subtract(RING.exp(RING.x(), mN), RING.sec(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
