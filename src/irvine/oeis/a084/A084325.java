package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A084325 Palindromes such that at least one divisor is non-palindromic; palindromes not in A062687.
 * @author Sean A. Irvine
 */
public class A084325 extends Sequence1 {

  private final Sequence mS = new A002113().skip();

  @Override
  public Z next() {
    while (true) {
      final Z p = mS.next();
      for (final Z d : Jaguar.factor(p).divisors()) {
        if (!Predicates.PALINDROME.is(d)) {
          return p;
        }
      }
    }
  }
}
