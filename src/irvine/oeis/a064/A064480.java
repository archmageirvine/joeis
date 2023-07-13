package irvine.oeis.a064;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064480.
 * @author Sean A. Irvine
 */
public class A064480 extends Sequence1 {

  private int[] mPartition = null;

  @Override
  public Z next() {
    if (mPartition == null) {
      mPartition = new int[] {1, 1, 1};
    } else {
      mPartition = IntegerPartition.merge(mPartition, IntegerPartition.dual(mPartition));
    }
    long cnt = 1;
    for (int k = 1; k < mPartition.length; ++k) {
      if (mPartition[k] != mPartition[k - 1]) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
