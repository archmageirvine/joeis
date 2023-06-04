package irvine.oeis.a063;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063995 Irregular triangle read by rows: T(n,k), n &gt;= 1, -(n-1) &lt;= k &lt;= n-1, = number of partitions of n with rank k.
 * @author Sean A. Irvine
 */
public class A063995 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private long[] mCounts = new long[0];

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      final IntegerPartition part = new IntegerPartition(++mN);
      mCounts = new long[2 * mN - 1];
      int[] p;
      while ((p = part.next()) != null) {
        ++mCounts[mN - 1 + p[0] - p.length];
      }
      mM = 0;
    }
    return Z.valueOf(mCounts[mM]);
  }
}
