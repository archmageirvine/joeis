package irvine.oeis.a384;

import irvine.math.partition.IntegerComposition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384993 Triangle read by rows: T(n,k) is the number of compositions (p_0,p_1,...,p_m) of n such that max(i + p_i) = k for 0 &lt;= i &lt;= m.
 * @author Sean A. Irvine
 */
public class A384993 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private long[] mRow = {1};

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      mRow = new long[++mN + 1];
      for (int k = 1; k <= mN; ++k) {
        final IntegerComposition comp = new IntegerComposition(mN, k);
        int[] c;
        while ((c = comp.next()) != null) {
          int max = 0;
          for (int j = 0; j < c.length; ++j) {
            max = Math.max(max, c[j] + j);
          }
          ++mRow[max];
        }
      }
    }
    return Z.valueOf(mRow[mM]);
  }
}

