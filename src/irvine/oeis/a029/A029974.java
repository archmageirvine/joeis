package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A029974 Primes that are palindromic in base 6.
 * @author Sean A. Irvine
 */
public class A029974 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString(6))) {
        return t;
      }
    }
  }
}
