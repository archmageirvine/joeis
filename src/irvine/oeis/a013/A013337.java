package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013337 E.g.f.: <code>cosh(exp(x)-sec(x))=1+1/2!*x^2+5/4!*x^4-20/5!*x^5+37/6!*x^6</code>...
 * @author Sean A. Irvine
 */
public class A013337 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.cosh(RING.subtract(RING.exp(RING.x(), mN), RING.sec(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
