package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A028981 Primes p such that p+1 is palindromic.
 * @author Sean A. Irvine
 */
public class A028981 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.PALINDROME.is(p.add(1))) {
        return p;
      }
    }
  }
}
