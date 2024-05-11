package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029976 Palindromic primes in base 8.
 * @author Sean A. Irvine
 */
public class A029976 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(8, t)) {
        return t;
      }
    }
  }
}
