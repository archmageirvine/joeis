package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A052057 Numbers k such that the decimal expansion of 2^k contains no palindromic substring except single digits.
 * @author Sean A. Irvine
 */
public class A052057 extends Sequence1 {

  private static final String[] QUICK = {"00", "11", "22", "33", "44", "55", "66", "77", "88", "99"};
  private int mN = -1;
  private Z mA = Z.ONE;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  static boolean isPalindromeFree(final String s) {
    // Do a cheap test first
    for (final String q : QUICK) {
      if (s.contains(q)) {
        return false;
      }
    }
    for (int k = 0; k < s.length(); ++k) {
      for (int j = k + 3; j <= s.length(); ++j) {
        if (StringUtils.isPalindrome(s.substring(k, j))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply2();
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("n = " + mN);
      }
      if (isPalindromeFree(mA.toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}

