package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A390504 Positive integers whose binary representation can be reduced to length zero by removing palindromic substrings of length at least 2.
 * @author Sean A. Irvine
 */
public class A390504 extends Sequence1 {

  private long mN = 2;

  private boolean is(final String s) {
    if (s.length() < 2) {
      return false;
    }
    if (StringUtils.isPalindrome(s)) {
      return true;
    }
    for (int k = 0; k < s.length() - 1; ++k) {
      for (int j = s.length(); j >= k + 2; --j) {
        if (StringUtils.isPalindrome(s.substring(k, j)) && is(s.substring(0, k) + s.substring(j))) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(Long.toBinaryString(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

