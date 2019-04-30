package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013557 Numerator of <code>[x^(2n)]</code> of the Taylor series <code>sec(cot(x)-coth(x))= 1 +2*x^2/9 +10*x^4/243 +2356*x^6/229635 +986*x^8/413343+</code>...
 * @author Sean A. Irvine
 */
public class A013557 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.sec(RING.subtract(RING.xcot(RING.x(), mN + 1), RING.xcoth(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
