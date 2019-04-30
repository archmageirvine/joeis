package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013553 Numerator of <code>[x^(2n+1)]</code> of the Taylor expansion <code>-arcsin(cot(x)-coth(x))</code>.
 * @author Sean A. Irvine
 */
public class A013553 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.asin(RING.subtract(RING.xcoth(RING.x(), mN + 1), RING.xcot(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
