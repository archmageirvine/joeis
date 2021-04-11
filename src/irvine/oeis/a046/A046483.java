package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029970;

/**
 * A046483 Primes that are palindromic in bases 10 and 15.
 * @author Sean A. Irvine
 */
public class A046483 extends A029970 {

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
