package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076879 In binary representation: number of substrings of n^2 having the same number of 0's and 1's as n.
 * @author Sean A. Irvine
 */
public class A076879 extends Sequence1 {

  private long mN = 0;
  private long mLim = 2;
  private long mBits = 1;

  @Override
  public Z next() {
    final int d = Long.bitCount(++mN);
    if (mN == mLim) {
      mLim *= 2;
      ++mBits;
    }
    final Z s = Z.valueOf(mN).square();
    long c = 0;
    for (int k = 0; k <= s.bitLength() - mBits; ++k) {
      int e = 0;
      for (int j = 0; j < mBits && e <= d; ++j) {
        if (s.testBit(k + j)) {
          ++e;
        }
      }
      if (e == d) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
