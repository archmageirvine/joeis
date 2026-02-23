package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083867 a(n) is the number of divisors of the n-th decimal palindrome that are palindromes.
 * @author Sean A. Irvine
 */
public class A083867 extends Sequence1 {

  private final Sequence mPalins = new A002113().skip();

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(mPalins.next()).divisors()) {
      if (Predicates.PALINDROME.is(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
