package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046377 Palindromes with exactly 3 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046377 extends A046369 {

  {
    setOffset(1);
  }

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
