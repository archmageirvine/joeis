package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013532 Numerator of <code>[x^(2n+1)]</code> in the Taylor series tan(cosec(x)-cosech(x)) <code>= x/3 +x^3/81 +949*x^5/204120 +2647*x^7/5511240+... </code>.
 * @author Sean A. Irvine
 */
public class A013532 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.tan(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcsch(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
