package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A052059 Least k such that the longest palindromic substring (without leading zeros) contained in 2^k has length n.
 * @author Sean A. Irvine
 */
public class A052059 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mLengths = new DynamicIntArray();
  private int mN = 0;
  private int mM = 0;
  private Z mA = Z.ONE;

  static int lengthOfLongestPalindrome(final String s) {
    for (int length = s.length(); length >= 1; --length) {
      for (int k = 0; k + length <= s.length(); ++k) {
        if (s.charAt(k) != '0') {
          final String sub = s.substring(k, k + length);
          if (StringUtils.isPalindrome(sub)) {
            return length;
          }
        }
      }
    }
    throw new RuntimeException(); // should not happen
  }

  private void step() {
    ++mM;
    mA = mA.multiply2();
    final int length = lengthOfLongestPalindrome(mA.toString());
    if (mLengths.get(length) == 0) {
      mLengths.set(length, mM);
    }
    if (mVerbose && mM % 1000 == 0) {
      StringUtils.message("n = " + mN + ", k = " + mM);
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    while (mLengths.get(mN) == 0) {
      step();
    }
    return Z.valueOf(mLengths.get(mN));
  }
}

