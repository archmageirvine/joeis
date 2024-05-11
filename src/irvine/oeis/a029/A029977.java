package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029977 Primes that are palindromic in base 9.
 * @author Sean A. Irvine
 */
public class A029977 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(9, t)) {
        return t;
      }
    }
  }
}
