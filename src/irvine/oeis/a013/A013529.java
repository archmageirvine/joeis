package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013529 Numerator of <code>[x^n]</code> in the Taylor expansion exp(cosec(x) - cosech(x)) <code>= 1 + x/3 + x^2/18 + x^3/162 + x^4/1944 + 211*x^5/51030 + ..</code>.
 * @author Sean A. Irvine
 */
public class A013529 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.exp(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcsch(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
