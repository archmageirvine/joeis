package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A050425 Numbers for which in base 2 the least number of digits that can be removed to leave a base 2 palindromic number (beginning with 1) is 1.
 * @author Sean A. Irvine
 */
public class A050425 implements Sequence {

  private long mN = 1;

  static boolean is(final String s) {
    for (int k = 1; k < s.length(); ++k) {
      if (StringUtils.isPalindrome(s.substring(0, k) + s.substring(k + 1))) {
        return true;
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
