package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013546 Numerator of <code>[x^(2n)]</code> in the Taylor expansion <code>cosh(cosec(x)-coth(x))=1 +x^2/72 -215*x^4/31104 +199159*x^6/235146240-</code>...
 * @author Sean A. Irvine
 */
public class A013546 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.cosh(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcoth(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
