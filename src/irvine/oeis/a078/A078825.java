package irvine.oeis.a078;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078825 Sum of distinct binary numbers contained as substrings in binary, circular formed representation of n and not longer than n.
 * @author Sean A. Irvine
 */
public class A078825 extends Sequence0 {

  private long mN = -1;
  private long mLim = 2;
  private long mShift = 0;

  @Override
  public Z next() {
    if (++mN == mLim) {
      mLim *= 2;
      ++mShift;
    }
    long m = mN;
    final HashSet<Long> seen = new HashSet<>();
    Z sum = Z.ZERO;
    do {
      long k = 0;
      while (k <= m) {
        k <<= 1;
        k += 1;
        if (seen.add(m & k)) {
          sum = sum.add(m & k);
        }
      }
      final long b = m & 1;
      m >>>= 1;
      m |= b << mShift;
    } while (m != mN);
    return sum;
  }
}
