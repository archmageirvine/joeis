package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A072362 Composite numbers whose sum of aliquot divisors is palindromic.
 * @author Sean A. Irvine
 */
public class A072362 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Predicates.PALINDROME.is(Functions.SIGMA1.z(c).subtract(c))) {
        return c;
      }
    }
  }
}
