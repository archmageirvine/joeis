package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046360 Composite palindromes divisible by the palindromic sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046360 extends A046358 {

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
