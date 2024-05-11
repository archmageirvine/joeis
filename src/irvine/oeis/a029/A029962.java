package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A029962 Palindromic in bases 5 and 10.
 * @author Sean A. Irvine
 */
public class A029962 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(5, t)) {
        return t;
      }
    }
  }
}
