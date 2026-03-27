package irvine.oeis.a394;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A305213.
 * @author Sean A. Irvine
 */
public class A394475 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> s = new HashSet<>();
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      if (Predicates.PRIME.is(d - 1) && mN % (d - 1) != 0) {
        s.add(d - 1);
      }
      if (Predicates.PRIME.is(d + 1) && mN % (d + 1) != 0) {
        s.add(d + 1);
      }
    }
    return Z.valueOf(s.size());
  }
}
