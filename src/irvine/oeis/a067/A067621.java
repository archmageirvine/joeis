package irvine.oeis.a067;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067621 Let t = coefficient of x^(2n+1) in expansion of sin(x)/(1-x^2); a(n)=denominator(t)-numerator(t).
 * @author Sean A. Irvine
 */
public class A067621 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C2 = RING.oneMinusXToTheN(2);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final Q c = RING.coeff(RING.sin(RING.x(), mN), C2, mN);
    return c.den().subtract(c.num());
  }
}
