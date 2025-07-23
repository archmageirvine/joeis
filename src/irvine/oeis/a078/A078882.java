package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A078882 Number of subsets S of {1,2,3,...,n} with the largest possible cardinality consistent with the requirement that if i and j are distinct elements of S then i XOR j is not in S. XOR is the bitwise exclusive-OR operator.
 * @author Sean A. Irvine
 */
public class A078882 extends Sequence1 {

  private final Sequence mSizes = new A078881();
  private long mN = 0;

  private boolean is(final long set) {
    for (long k = 2, bk = 2; bk <= set; bk <<= 1, ++k) {
      if ((set & bk) != 0) {
        for (long j = 1, bj = 1; j < k; bj <<= 1, ++j) {
          if ((set & bj) != 0 && (set & 1L << ((j ^ k) - 1)) != 0) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final long s = mSizes.next().longValueExact();
    long cnt = 0;
    for (long set = (1L << s) - 1; set < 1L << mN; set = Functions.SWIZZLE.l(set)) {
      if (is(set)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
