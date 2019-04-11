package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012861 Numerator of the coefficient of <code>[x^(2n)]</code> of the Taylor series log(cosec(x)*arctanh(x))= <code>x^2/2 +3*x^4/20 +4*x^6/45 +203*x^8/3240 +2038*x^10/42525 +</code>...
 * @author Sean A. Irvine
 */
public class A012861 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.log(RING.multiply(RING.xcsc(RING.x(), mN + 1), RING.atanh(RING.x(), mN + 1), mN + 1).shift(-1), mN).coeff(mN));
  }
}
