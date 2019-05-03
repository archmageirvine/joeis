package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012512 Expansion of e.g.f.: <code>tan(sinh(x)*log(x+1))=2/2!*x^2-3/3!*x^3+12/4!*x^4-40/5!*x^5..</code>.
 * @author Sean A. Irvine
 */
public class A012512 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.tan(RING.multiply(RING.sinh(RING.x(), mN), RING.log1p(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
