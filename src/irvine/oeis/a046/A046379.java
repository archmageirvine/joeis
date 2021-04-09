package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046379 Palindromes with exactly 5 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046379 extends A046371 {

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
