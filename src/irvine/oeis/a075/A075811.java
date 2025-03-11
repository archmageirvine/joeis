package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a039.A039956;

/**
 * A075811 Palindromic even squarefree numbers with an even number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A075811 extends A039956 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(t) && (Functions.OMEGA.i(t) & 1) == 0) {
        return t;
      }
    }
  }
}
