package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029963;

/**
 * A046475 Primes that are palindromic in bases 6 and 10.
 * @author Sean A. Irvine
 */
public class A046475 extends A029963 {

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
