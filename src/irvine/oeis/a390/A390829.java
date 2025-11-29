package irvine.oeis.a390;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390829 Initial values of 8 semiprimes in arithmetic progression with common difference 4.
 * @author Sean A. Irvine
 */
public class A390829 extends Sequence1 {

  private long mN = 5983;

  private boolean is(final long n) {
    for (long k = 0; k < 32; k += 4) {
      if (!Predicates.SEMIPRIME.is(n + k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 6;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
