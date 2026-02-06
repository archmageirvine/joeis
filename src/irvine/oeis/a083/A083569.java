package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083569 Smallest m not occurring earlier such that m+n is prime.
 * @author Sean A. Irvine
 */
public class A083569 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 1;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k) && Predicates.PRIME.is(mN + k)) {
        mUsed.set(k);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
