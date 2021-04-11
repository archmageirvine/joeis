package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a007.A007632;

/**
 * A046472 Palindromic primes in base 10 and base 2.
 * @author Sean A. Irvine
 */
public class A046472 extends A007632 {

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
