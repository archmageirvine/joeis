package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A050424 Numbers for which in base 2 the least number of digits that can be removed to leave a palindrome (possibly beginning with 0) is 5.
 * @author Sean A. Irvine
 */
public class A050424 implements Sequence {

  private long mN = 879;

  static boolean is(final String s) {
    if (A050420.is(s) || A050421.is(s) || A050422.is(s) || A050423.is(s)) {
      return false;
    }
    for (int k = 0; k < s.length(); ++k) {
      for (int j = 0; j < k; ++j) {
        for (int i = 0; i < j; ++i) {
          for (int h = 0; h < i; ++h) {
            for (int g = 0; g < h; ++g) {
              if (StringUtils.isPalindrome(s.substring(0, g) + s.substring(g + 1, h) + s.substring(h + 1, i) + s.substring(i + 1, j) + s.substring(j + 1, k) + s.substring(k + 1))) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toBinaryString(++mN);
      if (!StringUtils.isPalindrome(s) && is(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}
