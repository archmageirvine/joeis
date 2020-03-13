package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A029977 Primes that are palindromic in base 9.
 * @author Sean A. Irvine
 */
public class A029977 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString(9))) {
        return t;
      }
    }
  }
}
