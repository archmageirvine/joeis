package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032220 Number of ways to partition n labeled elements into pie slices of different odd sizes, allowing the pie to be turned over.
 * @author Sean A. Irvine
 */
public class A032220 extends A032209 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q f = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      f = f.divide(new Q(k));
      if ((k & 1) == 1) {
        final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(f, 1), k);
        prod = RING.multiply(prod, u, n);
      }
    }
    return prod;
  }
}
