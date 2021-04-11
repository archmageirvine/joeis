package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029731;

/**
 * A046484 Primes that are palindromic in bases 10 and 16.
 * @author Sean A. Irvine
 */
public class A046484 extends A029731 {

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
