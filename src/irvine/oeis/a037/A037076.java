package irvine.oeis.a037;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A037076 Palindromes which are the sum of a twin prime pair.
 * @author Sean A. Irvine
 */
public class A037076 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next().multiply2().add(2);
      if (Predicates.PALINDROME.is(s)) {
        return s;
      }
    }
  }
}
