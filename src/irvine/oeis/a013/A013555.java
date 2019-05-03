package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013555 Numerator of <code>[x^(2n+1)]</code> of the Taylor series <code>arctan(cot(x)-coth(x))= -2*x/3 +8*x^3/81 -52*x^5/1701 +112*x^7/10935 -51412*x^9/13640319+..</code>.
 * @author Sean A. Irvine
 */
public class A013555 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.atan(RING.subtract(RING.xcot(RING.x(), mN + 1), RING.xcoth(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
