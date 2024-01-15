package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067957 Number of divisor chains of length n: permutations s_1,s_2,...,s_n of 1,2,...,n such that for all j=1,2,...,n, s_j divides Sum_{i=1..j} s_i.
 * @author Sean A. Irvine
 */
public class A067957 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;

  private void search(final int sum, final int remaining, final long used) {
    if (remaining == 0) {
      ++mCount;
      return;
    }
    for (int k = 1; k <= mN; ++k) {
      final long bit = 1L << (k - 1);
      if ((used & bit) == 0 && sum % k == 0) {
        search(sum + k, remaining - 1, used | bit);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 63) {
      throw new UnsupportedOperationException();
    }
    mCount = 0;
    search(0, mN, 0);
    return Z.valueOf(mCount);
  }
}
