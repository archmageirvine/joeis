package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083868 Number of palindromic divisors d of n-th decimal palindrome m, such that 9&lt;d&lt;m.
 * @author Sean A. Irvine
 */
public class A083868 extends Sequence1 {

  private final Sequence mPalins = new A002113().skip();

  @Override
  public Z next() {
    long cnt = 0;
    final Z p = mPalins.next();
    for (final Z d : Jaguar.factor(p).divisors()) {
      if (!d.equals(p) && d.compareTo(Z.NINE) > 0 && Predicates.PALINDROME.is(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
