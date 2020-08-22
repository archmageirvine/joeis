package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013325 Numerator of [x^n] in the Taylor series arccosh(exp(x)-arctanh(x))= x-x^2/6-x^3/72 -359*x^4/2160 -1681*x^5/51840 -52981*x^6/435456 -...
 * @author Sean A. Irvine
 */
public class A013325 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return select(Q.ONE);
    }
    return select(RING.acosh(RING.subtract(RING.exp(RING.x(), mN + 1), RING.atanh(RING.x(), mN + 1)), mN).coeff(mN));
  }
}
