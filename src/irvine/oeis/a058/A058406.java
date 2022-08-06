package irvine.oeis.a058;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A058406 Total number of interior nodes in all series-parallel networks with n labeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058406 extends A058475 {

  private final Polynomial<Q> mEV = RING.empty();

  @Override
  public Z next() {
    mEV.add(new Q(super.next(), mF));
    return RING.coeff(mEV, RING.add(RING.one(), mV), mN).multiply(mF).toZ();
  }
}

