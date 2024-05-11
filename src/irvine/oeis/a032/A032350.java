package irvine.oeis.a032;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A032350 Palindromic nonprime numbers.
 * @author Sean A. Irvine
 */
public class A032350 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (Predicates.PALINDROME.is(a)) {
        return a;
      }
    }
  }
}
