package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390731 Numbers k not in A000961 such that A001414(k) is in A000961.
 * @author Sean A. Irvine
 */
public class A390731 extends Sequence1 {

  private long mN = 5;

  private boolean is(final long n) {
    return !Predicates.PRIME_POWER.is(n) && Predicates.PRIME_POWER.is(Functions.SOPFR.z(n));
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

