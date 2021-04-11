package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046492 Palindromic primes expressible as the sum of 3 consecutive palindromic primes.
 * @author Sean A. Irvine
 */
public class A046492 extends A046491 {

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
