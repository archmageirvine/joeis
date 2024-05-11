package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A029970 Numbers that are palindromic in bases 10 and 15.
 * @author Sean A. Irvine
 */
public class A029970 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(15, t)) {
        return t;
      }
    }
  }
}
