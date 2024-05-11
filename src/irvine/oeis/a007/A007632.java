package irvine.oeis.a007;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A007632 Numbers that are palindromic in bases 2 and 10.
 * @author Sean A. Irvine
 */
public class A007632 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.PALINDROME.is(2, p)) {
        return p;
      }
    }
  }
}
