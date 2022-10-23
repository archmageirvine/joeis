package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013338 Expansion of e.g.f.: sec(exp(x)-sec(x))=1+1/2!*x^2+9/4!*x^4-20/5!*x^5+177/6!*x^6...
 * @author Sean A. Irvine
 */
public class A013338 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.sec(RING.subtract(RING.exp(RING.x(), mN), RING.sec(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
