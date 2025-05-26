package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383968 Number of distinct subsets S of [1..n] such that for all 1 &lt;= k &lt;= n, there exists two elements x,y in S (not necessarily distinct) such that x+y = 2k.
 * @author Sean A. Irvine
 */
public class A383968 extends Sequence1 {

  private int mN = 0;
  private long mMask = 0;

  private boolean is(final long set) {
    long seen = 0;
    // In following a,b are offset by 1 (i.e., we have set elements 0..n-1
    for (long a = 0, k = 1; k <= set; k <<= 1, ++a) {
      if ((set & k) != 0) {
        // b must have same parity as a to get an even sum
        for (long b = a, j = k; j <= set; j <<= 2, b += 2) {
          if ((set & j) != 0) {
            seen |= 1L << ((a + b) >>> 1); // sums are even, divide by 2
            if (seen == mMask) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    mMask = (1L <<  mN) - 1;
    long cnt = 0;
    for (long set = 1; set < 1L << mN; set += 2) {
      if (is(set)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
