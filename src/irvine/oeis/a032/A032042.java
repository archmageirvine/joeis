package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A032042 Shifts left under "BFJ" <code>(reversible</code>, size, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032042 extends A032004 {

  private static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, RING.serlaplace(product()));
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size() - 1)), Q.ONE).add(get(size() - 1)).toZ().divide2();
  }
}
