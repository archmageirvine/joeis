package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a029.A029964;

/**
 * A046476 Primes that are palindromic in bases 7 and 10.
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
