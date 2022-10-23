package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013305 Numerators of coefficients in Taylor series expansion of arccosh(exp(x)-sin(x)).
 * @author Sean A. Irvine
 */
public class A013305 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return select(new Q(mN));
    }
    final Polynomial<Q> egf = RING.acosh(RING.subtract(RING.exp(RING.x(), mN + 1), RING.sin(RING.x(), mN + 1)), mN);
    //System.out.println(egf);
    return select(egf.coeff(mN));
  }
}
