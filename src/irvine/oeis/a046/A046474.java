package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029961;

/**
 * A046474 Primes that are palindromic in bases 4 and 10.
 * @author Sean A. Irvine
 */
public class A046474 extends A029961 {

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
