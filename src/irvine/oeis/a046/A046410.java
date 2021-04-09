package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046410 Palindromes with exactly 4 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046410 extends A046402 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}
