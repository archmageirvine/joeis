package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000642 a(1)=0; for n&gt;1, a(n) = number of isomeric hydrocarbons of the acetylene series with carbon content n.
 * @author Sean A. Irvine
 */
public class A000642 extends A000598 {

  @Override
  public Polynomial<Q> g() {
    return RING.multiply(RING.add(mG.substitutePower(2, mN), RING.pow(mG, 2, mN)), Q.HALF);
  }

  @Override
  public Z next() {
    super.next();
    if (mN == 0) {
      return Z.ZERO;
    }
    return g().coeff(mN - 1).toZ();
  }
}

