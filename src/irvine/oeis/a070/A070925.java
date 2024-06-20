package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070925 Number of subsets of A = {1,2,...,n} that have the same center of gravity as A, i.e., (n+1)/2.
 * @author Sean A. Irvine
 */
public class A070925 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k < 1L << (mN + 1); ++k) {
      // k is a bitset
      long sum = 0;
      long m = 0;
      for (long j = k, i = 0; j != 0; j >>>= 1, ++i) {
        if ((j & 1) == 1) {
          sum += i;
          ++m;
        }
      }
      if (2 * sum == mN * m) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
