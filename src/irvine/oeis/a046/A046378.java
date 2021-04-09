package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046378 Palindromes with exactly 4 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046378 extends A046370 {

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
