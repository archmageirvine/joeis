package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A032038 "BFJ" (reversible, size, labeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032038 extends A032000 {

  private static final Polynomial<Polynomial<Q>> C = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(C, RING.serlaplace(product(mN)));
    return Y_RING.eval(Y_RING.serlaplace(Y_RING.add(v.coeff(mN), v.coeff(1))), Q.ONE).toZ().divide2();
  }
}
