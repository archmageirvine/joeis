package irvine.oeis.a045;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A045960 Palindromic even lucky numbers.
 * @author Sean A. Irvine
 */
public class A045960 extends A045954 {

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
