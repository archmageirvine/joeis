package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.Permutation;

/**
 * A064482 Triangle read by rows: T(n,k) (n &gt;= 2, 1&lt;=k&lt;=n-1) is the number of permutations p of 1,...,n with max(|p(i)-p(i-1)|, i=2..n) = k.
 * @author Sean A. Irvine
 */
public class A064482 extends Sequence2 {

  private int mN = 1;
  private int mM = 1;
  private long[] mRow = null;

  private int max(final int[] s) {
    int max = 0;
    for (int k = 1; k < s.length; ++k) {
      final int diff = Math.abs(s[k] - s[k - 1]);
      if (diff > max) {
        max = diff;
      }
    }
    return max;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      final Permutation perm = new Permutation(++mN);
      int[] s;
      mRow = new long[mN];
      while ((s = perm.next()) != null) {
        ++mRow[max(s)];
      }
      mM = 1;
    }
    return Z.valueOf(mRow[mM]);
  }
}
