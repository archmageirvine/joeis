package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000642.
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

