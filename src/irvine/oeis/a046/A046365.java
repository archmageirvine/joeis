package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046365 Composite palindromes whose sum of prime factors is prime (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046365 extends A046363 {

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
