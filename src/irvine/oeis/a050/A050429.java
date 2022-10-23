package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A050429 Numbers for which in base 2 the least number of digits that can be removed to leave a base 2 palindromic number (beginning with 1) is 5.
 * @author Sean A. Irvine
 */
public class A050429 extends Sequence1 {

  private long mN = 31;

  static boolean is(final String s) {
    if (A050425.is(s) || A050426.is(s) || A050427.is(s) || A050428.is(s)) {
      return false;
    }
    for (int k = 1; k < s.length(); ++k) {
      for (int j = 1; j < k; ++j) {
        for (int i = 1; i < j; ++i) {
          for (int h = 1; h < i; ++h) {
            for (int g = 1; g < h; ++g) {
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
