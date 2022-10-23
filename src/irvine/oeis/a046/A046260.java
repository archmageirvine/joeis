package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A046260 Largest palindromic substring in 2^n.
 * @author Sean A. Irvine
 */
public class A046260 extends Sequence0 {

  private Z mA = null;

  static String largestPalindromicSubstring(final String s) {
    String largest = "0";
    for (int start = 0; start <= s.length() - largest.length(); ++start) {
      if (s.charAt(start) != '0') {
        for (int end = start + largest.length(); end <= s.length(); ++end) {
          final String sub = s.substring(start, end);
          if (StringUtils.isPalindrome(sub) && (sub.length() > largest.length() || sub.compareTo(largest) > 0)) {
            largest = sub;
          }
        }
      }
    }
    return largest;
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return new Z(largestPalindromicSubstring(mA.toString()));
  }
}
