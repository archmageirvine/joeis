package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032064 "BGK" (reversible, element, unlabeled) transform of 1,3,5,7,...
 * @author Sean A. Irvine
 */
public class A032064 implements Sequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  private int mN = -1;

  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    final Polynomial<Q> t1 = Y_RING.monomial(Q.ONE, 1);
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(t1, k), 2 * k - 1, n);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }

  @Override
  public Z next() {
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, product(++mN));
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(mN)), Q.ONE).add(Math.max(1, 2 * mN)).toZ().divide2();
  }
}
