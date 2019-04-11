package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013554 Numerator of <code>[x^(2n+1)]</code> in the Taylor expansion -tan(cot(x)-coth(x))= <code>2*x/3 +8*x^3/81 +556*x^5/25515 +496*x^7/98415 +717572*x^9/613814355 +</code>...
 * @author Sean A. Irvine
 */
public class A013554 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.tan(RING.subtract(RING.xcoth(RING.x(), mN + 1), RING.xcot(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
