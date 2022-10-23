package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013551 Numerator of [x^n] in the Taylor expansion exp(cot(x)-coth(x))= 1-2*x/3 +2x^2/9 -4*x^3/81 +2*x^4/243 -136*x^5/25515 +676*x^6/229635 -...
 * @author Sean A. Irvine
 */
public class A013551 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.exp(RING.subtract(RING.xcot(RING.x(), mN + 1), RING.xcoth(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
