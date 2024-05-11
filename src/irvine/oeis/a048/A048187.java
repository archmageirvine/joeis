package irvine.oeis.a048;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a005.A005114;

/**
 * A048187 Palindromic untouchable numbers.
 * @author Sean A. Irvine
 */
public class A048187 extends A005114 {

  @Override
  public Z next() {
    while (true) {
      final Z untouchable = super.next();
      if (Predicates.PALINDROME.is(untouchable)) {
        return untouchable;
      }
    }
  }
}
