package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032005 "AFK" (ordered, size, unlabeled) transform of 2,2,2,2,...
 * @author Sean A. Irvine
 */
public class A032005 extends Sequence0 {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Q> Y2 = Y_RING.monomial(Q.TWO, 1);

  protected int mN = -1;

  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y2, k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }

  @Override
  public Z next() {
    final Polynomial<Polynomial<Q>> v = product(++mN);
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(mN)), Q.ONE).toZ();
  }
}
