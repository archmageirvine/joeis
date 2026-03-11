package irvine.oeis.a393;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393670 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393670 extends Sequence1 {

  private IntegerPartition mPartitions = new IntegerPartition(1);
  private int mN = 1;
  private long mM = 0;

  private boolean is(final int[] p) {
    for (int k = 1; k < p.length; ++k) {
      if (p[k - 1] - p[k] <= 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final int[] p = mPartitions.next();
      if (p == null) {
        mPartitions = new IntegerPartition(++mN);
        mM = 0;
      } else if (is(p)) {
        return Z.valueOf(mM);
      }
    }
  }
}
