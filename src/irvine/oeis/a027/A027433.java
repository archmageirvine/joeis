package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027433 Sum over all 2^(2n) pairs (u,v) of binary sequences of length n of length of maximal common subsequence between them.
 * @author Sean A. Irvine
 */
public class A027433 extends Sequence0 {

  private int mN = -1;

  private static int longestCommonSubsequence(final long x, final long y, final int i, final int j) {
    if (i == 0 || j == 0) {
      return 0;
    }
    if ((x & 1) == (y & 1)) {
      return longestCommonSubsequence(x >>> 1, y >>> 1, i - 1, j - 1) + 1;
    } else {
      return Math.max(longestCommonSubsequence(x, y >>> 1, i, j - 1), longestCommonSubsequence(x >>> 1, y, i - 1, j));
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long limit = 1L << mN;
    for (long a = 0; a < limit; ++a) {
      sum = sum.add(mN); // lcs(a,a) == n
      // Since lcs(a,b) == lcs(b,a), only need to do once then double result
      for (long b = a + 1; b < limit; ++b) {
        sum = sum.add(2 * longestCommonSubsequence(a, b, mN, mN));
      }
    }
    return sum;
  }
}
