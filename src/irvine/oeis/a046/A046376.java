package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046376 Palindromes with exactly 2 palindromic prime factors (counted with multiplicity), and no other prime factors.
 * @author Sean A. Irvine
 */
public class A046376 extends A046368 {

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
