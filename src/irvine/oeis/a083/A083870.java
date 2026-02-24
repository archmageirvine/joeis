package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083870 Number of pairs (x,y) of palindromes such that n-th decimal palindrome = x*y and 1&lt;=x&lt;=y.
 * @author Sean A. Irvine
 */
public class A083870 extends Sequence1 {

  private final Sequence mPalins = new A002113().skip();

  @Override
  public Z next() {
    long cnt = 0;
    final Z p = mPalins.next();
    for (final Z d : Jaguar.factor(p).divisors()) {
      if (d.square().compareTo(p) <= 0 && Predicates.PALINDROME.is(d) && Predicates.PALINDROME.is(p.divide(d))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
