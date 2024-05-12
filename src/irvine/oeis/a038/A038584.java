package irvine.oeis.a038;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038584 Primes p such that the sum of the primes from 2 through p is a palindrome.
 * @author Sean A. Irvine
 */
public class A038584 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mSum = mSum.add(p);
      if (Predicates.PALINDROME.is(mSum)) {
        return p;
      }
    }
  }
}
