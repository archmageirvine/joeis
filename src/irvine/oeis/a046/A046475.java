package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029963;

/**
 * A046475 Palindromic primes in base 10 and base 6.
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
