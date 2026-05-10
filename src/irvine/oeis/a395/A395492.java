package irvine.oeis.a395;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395492 Sum of the distinct primes not dividing n that are adjacent to a divisor of n.
 * @author Sean A. Irvine
 */
public class A395492 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final HashSet<Long> set = new HashSet<>();
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if (d > 1 && mN % (d - 1) != 0 && Predicates.PRIME.is(d - 1)) {
        set.add(d - 1);
      }
      if (mN % (d + 1) != 0 && Predicates.PRIME.is(d + 1)) {
        set.add(d + 1);
      }
    }
    return Z.valueOf(LongUtils.sum(set));
  }
}
