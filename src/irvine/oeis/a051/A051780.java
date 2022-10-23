package irvine.oeis.a051;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051780 Numerators of Taylor series expansion of (exp(1-exp(x))-1)/(1-exp(x)).
 * @author Sean A. Irvine
 */
public class A051780 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q coeff) {
    return coeff.num();
  }

  @Override
  public Z next() {
    final Polynomial<Q> exp1 = RING.subtract(RING.one(), RING.exp(RING.x(), ++mN + 1));
    return select(RING.coeff(RING.subtract(RING.exp(exp1, mN + 1), RING.one()), exp1, mN));
  }
}
