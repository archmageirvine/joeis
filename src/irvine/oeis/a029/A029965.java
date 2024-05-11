package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A029965 Palindromic in bases 9 and 10.
 * @author Sean A. Irvine
 */
public class A029965 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(9, t)) {
        return t;
      }
    }
  }
}
