package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013517 Denominator of [x^(2n+1)] in the Taylor expansion sin(cosec(x)-cot(x))= x/2 + x^3/48 - x^5/1280 - 55*x^7/129024 - 143*x^9/1769472 + ...
 * @author Sean A. Irvine
 */
public class A013517 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.den().shiftLeft(mN);
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.sin(RING.tan(RING.x(), mN), mN).coeff(mN));
  }
}
