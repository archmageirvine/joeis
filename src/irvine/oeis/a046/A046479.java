package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029966;

/**
 * A046479 Palindromic primes in base 10 and base 11.
 * @author Sean A. Irvine
 */
public class A046479 extends A029966 {

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
