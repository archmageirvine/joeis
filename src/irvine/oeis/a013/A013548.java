package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013548 Numerator of <code>[x^(2n)]</code> of the Taylor series <code>sech(cosec(x)-coth(x))= 1-x^2/72 +221*x^4/31104 +244939*x^6/235146240 +1846213*x^8/13544423424-</code>...
 * @author Sean A. Irvine
 */
public class A013548 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.sech(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcoth(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
