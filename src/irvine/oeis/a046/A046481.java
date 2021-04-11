package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029968;

/**
 * A046481 Primes that are palindromic in bases 10 and 13.
 * @author Sean A. Irvine
 */
public class A046481 extends A029968 {

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
