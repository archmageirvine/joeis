package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013518 Numerator of [x^(2n+1)] in the Taylor expansion arcsin(cosec(x)-cot(x)) = x/2 + x^3/16 + 3*x^5/256 + 83*x^7/30720 + 8887*x^9/12386304 + ...
 * @author Sean A. Irvine
 */
public class A013518 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.asin(RING.tan(RING.x(), mN), mN).coeff(mN));
  }
}
