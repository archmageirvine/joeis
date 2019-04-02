package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013556 Numerator of [x^(2n)] of the Taylor series cos(cot(x)-coth(x))= 1 -2*x^2/9 +2*x^4/243 -676*x^6/229635 +62*x^8/295245 -...
 * @author Sean A. Irvine
 */
public class A013556 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.cos(RING.subtract(RING.xcot(RING.x(), mN + 1), RING.xcoth(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
