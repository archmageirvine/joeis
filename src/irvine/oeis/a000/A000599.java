package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000599.
 * @author Sean A. Irvine
 */
public class A000599 extends A000598 {

  @Override
  public Z next() {
    super.next();
    final Polynomial<Q> f = RING.subtract(mG, RING.one());
    return RING.add(RING.pow(f, 2, mN), f.substitutePower(2, mN)).coeff(mN).toZ().divide(2);
  }
}

