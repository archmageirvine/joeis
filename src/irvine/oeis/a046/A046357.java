package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046357 Composite palindromes with only palindromic prime factors whose sum is palindromic (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046357 extends A046355 {

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
