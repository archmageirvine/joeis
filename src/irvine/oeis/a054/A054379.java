package irvine.oeis.a054;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054379 Reduced numerators of the coefficients in a series expansion for Gamma[x].
 * @author Sean A. Irvine
 */
public class A054379 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mA = Polynomial.create(Q.NEG_ONE, Q.TWO);

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mA = RING.multiply(mA, Polynomial.create(new Q(++mN), Q.ONE));
    final Polynomial<Q> i = RING.integrate(mA);
    return select(RING.eval(i, Q.ONE).subtract(RING.eval(i, Q.ZERO)));
  }
}
