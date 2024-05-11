package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A029963 Palindromic in bases 6 and 10.
 * @author Sean A. Irvine
 */
public class A029963 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(6, t)) {
        return t;
      }
    }
  }
}
