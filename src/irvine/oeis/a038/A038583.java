package irvine.oeis.a038;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A038583 Palindromes that are the sum of consecutive initial primes.
 * @author Sean A. Irvine
 */
public class A038583 extends A007504 {

  {
    setOffset(1);
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z sum = super.next();
      if (Predicates.PALINDROME.is(sum)) {
        return sum;
      }
    }
  }
}
