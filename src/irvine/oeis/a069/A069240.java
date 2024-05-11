package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A069240 Integers arising from partial fraction decomposition of numbers G_n defined by A069238/A069239.
 * @author Sean A. Irvine
 */
public class A069240 extends Sequence1 {

  // It's just simpler to use these existing sequences ...
  private final Sequence mNumerators = new A069238();
  private final Sequence mDenominators = new A069239();
  private long mN = 0;

  private long b(final long p) {
    long b = 0;
    while (true) {
      final long n = p - 2 * ++b * b;
      if (Predicates.SQUARE.is(n)) {
        return b;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final Z den = mDenominators.next();
    Q e = new Q(mNumerators.next(), den);
    // Work out potential p's
    for (final Z pp : Jaguar.factor(den).toZArray()) {
      final long p = pp.longValue();
      final long pm1 = p - 1;
      final long b = b(p);
      final long a = LongUtils.sqrt(p - 2 * b * b);
      e = e.signedAdd(p % 4 != 3, new Q(Z.valueOf(2 * a).pow(2 * mN / pm1), pp));
    }
    return e.toZ();
  }
}

