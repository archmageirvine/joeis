package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029965;

/**
 * A046478 Primes that are palindromic in bases 9 and 10.
 * @author Sean A. Irvine
 */
public class A046478 extends A029965 {

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
