package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A068046 Palindromes of length greater than 1 in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A068046 extends A000796 {

  private static final int HEURITIC_MAX_LENGTH = 1000;
  private final int[] mBuf = new int[HEURITIC_MAX_LENGTH];
  {
    for (int k = 0; k < mBuf.length; ++k) {
      mBuf[k] = super.next().intValueExact();
    }
  }
  private long mN = 1;
  private int mM = -1;
  private final TreeSet<Integer> mLengths = new TreeSet<>();

  protected Z select(final int length, final Z value, final long start) {
    return value;
  }

  private boolean isPalindrome(final int len) {
    for (int k = mM + 1, j = mM + len; k < j; ++k, --j) {
      if (mBuf[k % mBuf.length] != mBuf[j % mBuf.length]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (mLengths.isEmpty()) {
      if (++mM == mBuf.length) {
        mM = 0;
      }
      mBuf[mM] = super.next().intValueExact();
      ++mN;
      for (int len = 2; len < mBuf.length; ++len) {
        if (isPalindrome(len)) {
          mLengths.add(len);
        }
      }
    }
    final int l = mLengths.pollFirst();
    Z res = Z.ZERO;
    for (int k = 0; k < l; ++k) {
      res = res.multiply(10).add(mBuf[(mM + 1 + k) % mBuf.length]);
    }
    return select(l, res, mN);
  }
}

