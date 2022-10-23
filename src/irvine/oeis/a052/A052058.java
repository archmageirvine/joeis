package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A052058 Numbers k such that the largest palindromic substring (without leading zeros) of 2^k is a repdigit of minimum length 2.
 * @author Sean A. Irvine
 */
public class A052058 extends Sequence1 {

  private int mN = 0;
  private Z mA = Z.ONE;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private static boolean isRep(final String s) {
    final char c = s.charAt(0);
    for (int k = 1; k < s.length(); ++k) {
      if (s.charAt(k) != c) {
        return false;
      }
    }
    return true;
  }

  static boolean isLongestPalindromeARep(final String s) {
    for (int length = s.length(); length >= 2; --length) {
      String biggest = "";
      for (int k = 0; k + length <= s.length(); ++k) {
        if (s.charAt(k) != '0') {
          final String sub = s.substring(k, k + length);
          if (StringUtils.isPalindrome(sub)) {
            if (sub.compareTo(biggest) > 0) {
              biggest = sub;
            }
          }
        }
      }
      if (!biggest.isEmpty()) {
        return isRep(biggest);
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("n = " + mN);
      }
      if (isLongestPalindromeARep(mA.toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}

