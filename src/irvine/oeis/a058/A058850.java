package irvine.oeis.a058;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a262.A262044;

/**
 * A058850 Palindromes that are the sum of consecutive initial odd composites.
 * @author Sean A. Irvine
 */
public class A058850 extends A262044 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(t)) {
        return t;
      }
    }
  }
}
