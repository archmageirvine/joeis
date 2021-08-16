package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A050420 Numbers for which in base 2 the least number of digits that can be removed to leave a palindrome (possibly beginning with 0) is 1.
 * @author Sean A. Irvine
 */
public class A050420 implements Sequence {

  private long mN = 1;

  static boolean is(final String s) {
    for (int k = 0; k < s.length(); ++k) {
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
