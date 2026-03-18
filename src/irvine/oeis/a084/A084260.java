package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A084260 Triangular numbers that set a new record for number of triangular divisors.
 * @author Sean A. Irvine
 */
public class A084260 extends Sequence1 {

  private final Sequence mS = new A000217().skip();
  private long mRecord = 0;

  private long count(final Z t) {
    final FactorSequence fs = Jaguar.factor(t);
    if (fs.sigma0AsLong() <= mRecord) {
      return 0;
    }
    long cnt = 0;
    for (final Z d : fs.divisors()) {
      if (Predicates.TRIANGULAR.is(d)) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mS.next();
      final long cnt = count(t);
      if (cnt > mRecord) {
        mRecord = cnt;
        return t;
      }
    }
  }
}
