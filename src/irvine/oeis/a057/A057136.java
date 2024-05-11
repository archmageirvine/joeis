package irvine.oeis.a057;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A057136 Palindromes whose square root is a palindrome.
 * @author Sean A. Irvine
 */
public class A057136 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next().square();
      if (Predicates.PALINDROME.is(palin)) {
        return palin;
      }
    }
  }
}
