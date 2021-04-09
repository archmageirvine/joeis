package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046380 Palindromes with exactly 6 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046380 extends A046369 {

  @Override
  protected int targetOmega() {
    return 6;
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
