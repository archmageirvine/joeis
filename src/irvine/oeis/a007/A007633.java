package irvine.oeis.a007;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A007633 Palindromic in bases 3 and 10.
 * @author Sean A. Irvine
 */
public class A007633 extends A002113 {

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
