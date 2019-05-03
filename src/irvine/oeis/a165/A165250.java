package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A165250 Members of <code>A165249</code> that are not palindromes when written in binary.
 * @author Sean A. Irvine
 */
public class A165250 implements Sequence {

  private long mN = 0;

  private boolean test(final long n) {
    final String s = Long.toBinaryString(n);
    if (StringUtils.isPalindrome(s)) {
      return false;
    }
    final int len = s.length();
    final int delta = len & 1;
    final int halfLen = len / 2;
    int count = 0;
    for (int k = 0; k < halfLen; ++k) {
      if (s.charAt(k) == '1') {
        ++count;
      }
    }
    for (int k = halfLen + delta; k < len; ++k) {
      if (s.charAt(k) == '1') {
        --count;
      }
    }
    return count == 0;
  }

  @Override
  public Z next() {
    while (!test(++mN)) {
    }
    return Z.valueOf(mN);
  }
}
