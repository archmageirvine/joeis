package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058815 Numerators in expansion of exp(exp(x)-1)/(2-x).
 * @author Sean A. Irvine
 */
public class A058815 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> DEN = Polynomial.create(Q.TWO, Q.NEG_ONE);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    return select(RING.coeff(RING.exp(RING.subtract(RING.exp(RING.x(), mN), RING.one()), mN), DEN, mN));
  }
}
