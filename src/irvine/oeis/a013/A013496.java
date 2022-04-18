package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013496 Expansion of e.g.f.: exp(tanh(x)-arctanh(x))=1-4/3!*x^3-8/5!*x^5+160/6!*x^6-992/7!*x^7...
 * @author Sean A. Irvine
 */
public class A013496 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.exp(RING.subtract(RING.tanh(RING.x(), mN), RING.atanh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
