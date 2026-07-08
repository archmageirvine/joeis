package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085727 Number of semiprimes between n and 2n (inclusive).
 * @author Sean A. Irvine
 */
public class A085727 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    for (long k = 2 * mN + 1; k <= 2 * (mN + 1); ++k) {
      if (Predicates.SEMIPRIME.is(k)) {
        ++mCount;
      }
    }
    if (Predicates.SEMIPRIME.is(mN)) {
      --mCount;
    }
    ++mN;
    return Z.valueOf(mCount);
  }
}
