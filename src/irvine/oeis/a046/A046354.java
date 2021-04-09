package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046354 Composite palindromes whose sum of prime factors is palindromic (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046354 extends A046352 {

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
