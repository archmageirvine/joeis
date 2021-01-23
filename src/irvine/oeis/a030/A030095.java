package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A030095 Primes p such that 666p is palindromic.
 * @author Sean A. Irvine
 */
public class A030095 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (StringUtils.isPalindrome(p.multiply(666).toString())) {
        return p;
      }
    }
  }
}
