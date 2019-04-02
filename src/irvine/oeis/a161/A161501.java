package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A161501 a(n) = the smallest positive integer that is a palindrome when represented in binary, and is made by appending some number (zero or more) of binary digits on the right of n's binary representation.
 * @author Sean A. Irvine
 */
public class A161501 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final String base = Long.toBinaryString(++mN);
    if (StringUtils.isPalindrome(base)) {
      return Z.valueOf(mN);
    }
    if (StringUtils.isPalindrome(base + "1")) {
      return Z.valueOf(mN).multiply2().add(1);
    }
    if (StringUtils.isPalindrome(base + "01")) {
      return Z.valueOf(mN).shiftLeft(2).add(1);
    }
    if (StringUtils.isPalindrome(base + "11")) {
      return Z.valueOf(mN).shiftLeft(2).add(3);
    }
    final StringBuilder padding = new StringBuilder("00");
    long v = 1;
    int c = 3;
    long lim = 8;
    while (true) {
      final String t = padding + Long.toBinaryString(v);
      final String w = base + t.substring(t.length() - c);
      if (StringUtils.isPalindrome(w)) {
        return new Z(w, 2);
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

