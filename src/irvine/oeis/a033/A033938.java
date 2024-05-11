package irvine.oeis.a033;

import irvine.math.group.IntegersModMul;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A033938 Palindromic primes n such that the period of 1/n is a palindrome.
 * @author Sean A. Irvine
 */
public class A033938 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TWO.equals(p) || Z.FIVE.equals(p)) {
        return p;
      }
      final Z period = new IntegersModMul(p).order(Z.TEN);
      if (Predicates.PALINDROME.is(period)) {
        return p;
      }
    }
  }
}
