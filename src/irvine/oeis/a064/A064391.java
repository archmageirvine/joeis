package irvine.oeis.a064;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064391 Triangle T(n,k) with zeroth row {1} and row n for n &gt;= 1 giving number of partitions of n with crank k, for -n &lt;= k &lt;= n.
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

