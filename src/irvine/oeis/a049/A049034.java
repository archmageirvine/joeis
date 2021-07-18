package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049034 Scaled sums of odd reciprocals.
 * @author Sean A. Irvine
 */
public class A049034 implements Sequence {

  private long mN = -1;
  private Q mSum = Q.ZERO;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    mSum = mSum.add(new Q(1, mN));
    return mSum.multiply(mF).toZ();
  }
}
