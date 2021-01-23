package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032231 "DGK" (bracelet, element, unlabeled) transform of 2,2,2,2,...
 * @author Sean A. Irvine
 */
public class A032231 implements Sequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);
  protected static final Polynomial<Q> T = Y_RING.monomial(Q.ONE, 1);

  private int mN = -1;

  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(T, k), 2, n);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }

  @Override
  public Z next() {
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, product(++mN));
    final Polynomial<Q> p = v.coeff(mN);
    return Y_RING.eval(Y_RING.serlaplace(p.shift(-1)), Q.ONE).add(p.coeff(1)).add(p.coeff(2)).divide(2).toZ();
  }
}
