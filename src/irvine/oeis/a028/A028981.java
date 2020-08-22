package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A028981 Primes p such that p+1 is palindromic.
 * @author Sean A. Irvine
 */
public class A028981 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (StringUtils.isPalindrome(p.add(1).toString())) {
        return p;
      }
    }
  }
}
