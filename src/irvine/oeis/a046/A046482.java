package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029969;

/**
 * A046482 Primes that are palindromic in bases 10 and 14.
 * @author Sean A. Irvine
 */
public class A046482 extends A029969 {

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
