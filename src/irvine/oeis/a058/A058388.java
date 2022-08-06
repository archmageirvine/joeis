package irvine.oeis.a058;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058388 Total number of interior nodes in all essentially parallel series-parallel networks with n labeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058388 extends A058475 {

  private final Polynomial<Q> mEV = RING.empty();
  private final Sequence mQ = new A058379();

  @Override
  public Z next() {
    mEV.add(new Q(super.next(), mF));
    return RING.coeff(RING.add(mEV, mV), RING.add(RING.one(), mV), mN).multiply(mF).toZ().subtract(mQ.next());
  }
}

