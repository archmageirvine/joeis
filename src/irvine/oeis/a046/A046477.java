package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029804;

/**
 * A046477 Primes that are palindromic in bases 8 and 10.
 * @author Sean A. Irvine
 */
public class A046477 extends A029804 {

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
