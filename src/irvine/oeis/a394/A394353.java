package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394353 allocated for Michael Shmoish.
 * @author Sean A. Irvine
 */
public class A394353 extends Sequence0 {

  private final HashSet<Long> mPrimes = new HashSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long y = 0; y <= mN; ++y) {
      for (long x = 0; x <= y; ++x) {
        final long t = x * y + (x + y) * mN;
        if (Predicates.PRIME.is(t)) {
          mPrimes.add(t);
        }
      }
    }
    return Z.valueOf(mPrimes.size());
  }
}
