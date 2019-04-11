package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A161502 <code>a(n) =</code> the smallest number of binary digits that when appended to the right side of the binary representation of <code>n,</code> forms a binary palindrome.
 * @author Sean A. Irvine
 */
public class A161502 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final String base = Long.toBinaryString(++mN);
    if (StringUtils.isPalindrome(base)) {
      return Z.ZERO;
    }
    if (StringUtils.isPalindrome(base + "1")) {
      return Z.ONE;
    }
    if (StringUtils.isPalindrome(base + "01")) {
      return Z.TWO;
    }
    if (StringUtils.isPalindrome(base + "11")) {
      return Z.TWO;
    }
    final StringBuilder padding = new StringBuilder("00");
    long v = 1;
    int c = 3;
    long lim = 8;
    while (true) {
      final String t = padding + Long.toBinaryString(v);
      if (StringUtils.isPalindrome(base + t.substring(t.length() - c))) {
        return Z.valueOf(c);
      }
      v += 2;
      if (v > lim) {
        padding.append('0');
        lim <<= 1;
        ++c;
        v = 1;
      }
    }
  }
}

