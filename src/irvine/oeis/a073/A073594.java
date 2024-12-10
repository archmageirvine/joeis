package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073594 extends Sequence1 {

  private int mN = 0;
  private Q mSum = Q.ZERO;
  private Q mInnerSum = Q.ONE;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    mSum = mSum.add(new Q(Z.NEG_ONE.pow(mN + 1), mN).multiply(mInnerSum));
    mInnerSum = mInnerSum.signedAdd((mN & 1) == 0, new Q(1, 2L * mN + 1));
    return select(mSum);
  }
}
