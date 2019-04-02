package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A164302 a(n) = 2* (the n-th positive (odd) integer that is a palindrome when written in base 2).
 * @author Sean A. Irvine
 */
public class A164302 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toBinaryString(++mN);
      if (StringUtils.isPalindrome(s)) {
        return Z.valueOf(2 * mN);
      }
    }
  }
}

