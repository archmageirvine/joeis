package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013416 Expansion of e.g.f.: exp(arcsin(x)-arcsinh(x))=1+2/3!*x^3+40/6!*x^6+450/7!*x^7+2240/9!*x^9...
 * @author Sean A. Irvine
 */
public class A013416 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.subtract(RING.asin(RING.x(), mN), RING.asinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
