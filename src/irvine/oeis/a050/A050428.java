package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A050428 Numbers for which in base 2 the least number of digits that can be removed to leave a base 2 palindromic number (beginning with 1) is 4.
 * @author Sean A. Irvine
 */
public class A050428 implements Sequence {

  private long mN = 15;

  static boolean is(final String s) {
    if (A050425.is(s) || A050426.is(s) || A050427.is(s)) {
      return false;
    }
    for (int k = 1; k < s.length(); ++k) {
      for (int j = 1; j < k; ++j) {
        for (int i = 1; i < j; ++i) {
          for (int h = 1; h < i; ++h) {
            if (StringUtils.isPalindrome(s.substring(0, h) + s.substring(h + 1, i) + s.substring(i + 1, j) + s.substring(j + 1, k) + s.substring(k + 1))) {
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
    while (true) {
      final String s = Long.toBinaryString(++mN);
      if (!StringUtils.isPalindrome(s) && is(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}
