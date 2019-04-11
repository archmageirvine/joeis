package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013307 Numerator of <code>[x^n]</code> in the Taylor series arccosh(exp(x)-tan(x))= <code>x-x^2/6 -x^3/72 -43*x^4/432 -221*x^5/10368 -89513*x^6/2177280-</code>...
 * @author Sean A. Irvine
 */
public class A013307 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return select(new Q(mN));
    }
    final Polynomial<Q> egf = RING.acosh(RING.subtract(RING.exp(RING.x(), mN + 1), RING.tan(RING.x(), mN + 1)), mN);
    //System.out.println(egf);
    return select(egf.coeff(mN));
  }
}
