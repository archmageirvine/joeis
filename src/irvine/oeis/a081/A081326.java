package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081326 Number of partitions of n into two 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A081326 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicBooleanArray mThreeSmooth = new LongDynamicBooleanArray();

  @Override
  public Z next() {
    if (Predicates.SMOOTH.is(3, ++mN)) {
      mThreeSmooth.set(mN);
    }
    long cnt = 0;
    for (long k = 1; 2 * k <= mN; ++k) {
      if (mThreeSmooth.isSet(k) && mThreeSmooth.isSet(mN - k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

