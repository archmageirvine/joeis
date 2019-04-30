package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013323 Numerator of <code>[x^n]</code> in the Taylor series <code>arccosh(exp(x)-arcsinh(x))= x+x^2/3 -x^3/18 -14*x^4/135 +47*x^5/3240 +3527*x^6/68040 -4787*x^7/680400-</code>...
 * @author Sean A. Irvine
 */
public class A013323 implements Sequence {

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
    return select(RING.acosh(RING.subtract(RING.exp(RING.x(), mN + 1), RING.asinh(RING.x(), mN + 1)), mN).coeff(mN));
  }
}
