package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012654 E.g.f.: sinh(tanh(x)*log(x+1))=2/2!*x^2-3/3!*x^3-10/5!*x^5+280/6!*x^6...
 * @author Sean A. Irvine
 */
public class A012654 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.sinh(RING.multiply(RING.tanh(RING.x(), mN), RING.log1p(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
