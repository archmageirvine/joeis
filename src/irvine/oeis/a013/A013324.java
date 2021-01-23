package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013324 Numerator of [x^n] of the Taylor series arccosh(exp(x)-tanh(x))= x+x^2/2 -x^3/8 -7*x^4/48 +3*x^5/128 +631*x^6/11520 +37*x^7/15360 -12731*x^8/645120 -...
 * @author Sean A. Irvine
 */
public class A013324 implements Sequence {

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
    return select(RING.acosh(RING.subtract(RING.exp(RING.x(), mN + 1), RING.tanh(RING.x(), mN + 1)), mN).coeff(mN));
  }
}
