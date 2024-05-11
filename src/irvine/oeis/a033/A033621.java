package irvine.oeis.a033;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A033621 n-1 is a palindrome in base 10, n+1 is a palindrome in base 17.
 * @author Sean A. Irvine
 */
public class A033621 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (Predicates.PALINDROME.is(17, a.add(2))) {
        return a.add(1);
      }
    }
  }
}
