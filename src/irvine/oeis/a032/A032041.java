package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A032041 "BFJ" <code>(reversible</code>, size, labeled) transform of 1,3,5,7...
 * @author Sean A. Irvine
 */
public class A032041 extends A032003 {

  private static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, RING.serlaplace(product(mN)));
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(mN)), Q.ONE).add(2 * mN - 1).toZ().divide2();
  }
}
