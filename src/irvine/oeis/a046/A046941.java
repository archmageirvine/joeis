package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046941 Palindromic primes whose indices n are also palindromes.
 * @author Sean A. Irvine
 */
public class A046941 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (Predicates.PALINDROME.is(p) && Predicates.PALINDROME.is(mN)) {
        return p;
      }
    }
  }
}
