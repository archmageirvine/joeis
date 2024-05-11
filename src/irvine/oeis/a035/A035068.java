package irvine.oeis.a035;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A035068 Palindromic prime lengths of factorials: see A035067.
 * @author Sean A. Irvine
 */
public class A035068 extends A035066 {

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
