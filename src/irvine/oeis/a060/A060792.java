package irvine.oeis.a060;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a006.A006995;

/**
 * A060792 Numbers that are palindromic in bases 2 and 3.
 * @author Sean A. Irvine
 */
public class A060792 extends A006995 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.PALINDROME.is(3, p)) {
        return p;
      }
    }
  }
}
