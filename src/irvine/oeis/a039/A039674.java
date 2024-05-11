package irvine.oeis.a039;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A039674 Palindromic Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039674 extends A039672 {

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
