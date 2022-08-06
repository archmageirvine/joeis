package irvine.oeis.a058;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058475 Total number of interior nodes in all series-parallel networks with n labeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058475 extends A058379 {

  private final Sequence mVSeq = new A058381();
  private final Sequence mRSeq = new A058380();
  protected final Polynomial<Q> mV = RING.empty();
  private final Polynomial<Q> mR = RING.empty();

  @Override
  public Z next() {
    super.next();
    mV.add(new Q(mVSeq.next(), mF));
    mR.add(new Q(mRSeq.next(), mF));
    final Polynomial<Q> num = RING.subtract(RING.multiply(mA, mV, mN), mR);
    return RING.coeff(num, RING.subtract(RING.one(), mV), mN).multiply(mF).toZ();
  }
}

