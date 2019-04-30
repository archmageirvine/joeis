package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012859 Numerator of the coefficient of <code>[x^(2n)]</code> of the Taylor series <code>log(cosec(x)*arcsinh(x))= x^4/15 -x^6/30 +25*x^8/1134 -269*x^10/17010 +4401359*x^12/364864500-</code>...
 * @author Sean A. Irvine
 */
public class A012859 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.log(RING.multiply(RING.xcsc(RING.x(), mN + 1), RING.asinh(RING.x(), mN + 1), mN + 1).shift(-1), mN).coeff(mN));
  }
}
