package irvine.oeis.a052;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052249 Triangle T(n,k) (n &gt;= 1, k &gt;= 1) giving dimension of bigrading of Connes-Moscovici noncocommutative algebra.
 * @author Sean A. Irvine
 */
public class A052249 implements Sequence {

  private int mN = 0;
  private int mM = 0;
  private long[] mRow = null;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN;
      mRow = new long[++mN];
      final IntegerPartition part = new IntegerPartition(mN);
      int[] p;
      while ((p = part.next()) != null) {
        int cnt = 0;
        for (int k = 0; k < p.length && p[k] > 1; ++k) {
          ++cnt;
        }
        ++mRow[cnt];
      }
    }
    return Z.valueOf(mRow[mM]);
  }
}
