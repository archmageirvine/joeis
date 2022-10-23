package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012870 Numerator of [x^(4n+2)] in the Taylor series -log(cot(x)*tanh(x))= 2*x^2/3 +124*x^6/2835 +292*x^10/66825 +65528*x^14/127702575 -...
 * @author Sean A. Irvine
 */
public class A012870 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 4;
    return select(RING.log(RING.multiply(RING.xcot(RING.x(), mN + 1), RING.tanh(RING.x(), mN + 1), mN + 1).shift(-1), mN).coeff(mN).negate());
  }
}
