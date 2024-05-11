package irvine.oeis.a030;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030095 Primes p such that 666p is palindromic.
 * @author Sean A. Irvine
 */
public class A030095 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.PALINDROME.is(p.multiply(666))) {
        return p;
      }
    }
  }
}
