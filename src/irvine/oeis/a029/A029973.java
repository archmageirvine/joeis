package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029973 Primes that are palindromic in base 5.
 * @author Sean A. Irvine
 */
public class A029973 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(5, t)) {
        return t;
      }
    }
  }
}
