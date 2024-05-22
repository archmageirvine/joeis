package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A028986 Palindromes whose sum of divisors is palindromic.
 * @author Sean A. Irvine
 */
public class A028986 extends A002113 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.PALINDROME.is(Functions.SIGMA1.z(p))) {
        return p;
      }
    }
  }
}
