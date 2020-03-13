package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A029981 Primes that are palindromic in base 14.
 * @author Sean A. Irvine
 */
public class A029981 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString(14))) {
        return t;
      }
    }
  }
}
