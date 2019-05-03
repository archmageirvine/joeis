package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013531 Numerator of <code>[x^(2n+1)]</code> in the Taylor expansion <code>arcsin(cosec(x) - cosech(x)) = x/3 + x^3/162 + 5*x^5/1134 + 19*x^7/76545 + 13793*x^9/218245104 +</code> ...
 * @author Sean A. Irvine
 */
public class A013531 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.asin(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcsch(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
