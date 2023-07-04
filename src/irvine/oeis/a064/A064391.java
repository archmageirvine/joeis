package irvine.oeis.a064;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064390.
 * @author Sean A. Irvine
 */
public class A064391 extends Sequence0 {

  private int mN = 0;
  private long[] mCounts = {1};
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      final IntegerPartition part = new IntegerPartition(++mN);
      mCounts = new long[2 * mN + 1];
      int[] p;
      while ((p = part.next()) != null) {
        ++mCounts[IntegerPartition.crank(p) + mN]; // -n..n -> 0..2*n
      }
      mM = 0;
    }
    return Z.valueOf(mCounts[mM]);
  }
}

