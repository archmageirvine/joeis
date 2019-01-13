package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.q.Q;
import irvine.oeis.Sequence;

/**
 * A002514.
 * @author Sean A. Irvine
 */
public class A002514 implements Sequence {

  private Q mA = Q.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(Z.valueOf(2 * mN - 1).square().multiply(9).subtract(4)).divide(mN).divide(48);
    return mA.add(Q.HALF).toZ();
  }
}
