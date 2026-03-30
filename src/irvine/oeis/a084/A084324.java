package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A084324 Palindromic numbers that set a new record for number of palindromic divisors.
 * @author Sean A. Irvine
 */
public class A084324 extends Sequence1 {

  private final Sequence mS = new A002113().skip();
  private long mRecord = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = mS.next();
      long cnt = 0;
      for (final Z d : Jaguar.factor(p).divisors()) {
        if (Predicates.PALINDROME.is(d)) {
          ++cnt;
        }
      }
      if (cnt > mRecord) {
        mRecord = cnt;
        return p;
      }
    }
  }
}
