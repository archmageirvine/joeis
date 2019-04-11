package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012857 Numerator of <code>[x^(2n)]</code> of the Taylor expansion log(cosec(x)*arctan(x))= <code>-x^2/6 +3*x^4/20 -50*x^6/567 +203*x^8/3240 -7472*x^10/155925 +</code>...
 * @author Sean A. Irvine
 */
public class A012857 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return select(Q.ZERO);
    }
    return select(RING.log(RING.multiply(RING.xcsc(RING.x(), mN + 1), RING.atan(RING.x(), mN + 1), mN + 1).shift(-1), mN).coeff(mN));
  }
}
