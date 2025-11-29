package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a067.A067666;

/**
 * A390729 Numbers k not in A000961 such that A001414(k) and A067666(k) are in A000961.
 * @author Sean A. Irvine
 */
public class A390729 extends Sequence1 {

  private final DirectSequence mA = new A067666();
  private long mN = 5;

  private boolean is(final long n) {
    if (Predicates.PRIME_POWER.is(n)) {
      return false;
    }
    if (!Predicates.PRIME_POWER.is(Functions.SOPFR.z(n))) {
      return false;
    }
    return Predicates.PRIME_POWER.is(mA.a(Z.valueOf(n)));
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

