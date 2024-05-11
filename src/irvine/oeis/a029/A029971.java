package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029971 Palindromic primes in base 3.
 * @author Sean A. Irvine
 */
public class A029971 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(3, t)) {
        return t;
      }
    }
  }
}
