package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A032040 "BFJ" (reversible, size, labeled) transform of 1,2,3,4...
 * @author Sean A. Irvine
 */
public class A032040 extends A032002 {

  private static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, RING.serlaplace(product(mN)));
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(mN)), Q.ONE).add(mN).toZ().divide2();
  }
}
