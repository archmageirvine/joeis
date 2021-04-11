package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029967;

/**
 * A046480 Palindromic primes in base 10 and base 12.
 * @author Sean A. Irvine
 */
public class A046480 extends A029967 {

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
