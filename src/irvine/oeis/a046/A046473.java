package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a007.A007633;

/**
 * A046473 Primes that are palindromic in bases 3 and 10.
 * @author Sean A. Irvine
 */
public class A046473 extends A007633 {

  @Override
  public Z next() {
    while (true) {
      final Z palindrome = super.next();
      if (palindrome.isProbablePrime()) {
        return palindrome;
      }
    }
  }
}
