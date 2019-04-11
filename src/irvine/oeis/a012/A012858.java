package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012858 Numerator of <code>[x^(4n+2)]</code> in the Taylor series log(cosec(x)*sinh(x))= <code>x^2/3 +2*x^6/2835 +2*x^10/467775 +4*x^14/127702575 +</code>..
 * @author Sean A. Irvine
 */
public class A012858 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 4;
    return select(RING.log(RING.multiply(RING.xcsc(RING.x(), mN + 1), RING.sinh(RING.x(), mN + 1), mN + 1).shift(-1), mN).coeff(mN));
  }
}
