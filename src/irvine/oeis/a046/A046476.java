package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029964;

/**
 * A046476 Palindromic primes in base 10 and base 7.
 * @author Sean A. Irvine
 */
public class A046476 extends A029964 {

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
