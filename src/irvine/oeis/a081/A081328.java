package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081328 Greatest 3-smooth number m such that n-m is also 3-smooth, a(n)=0 if no such 3-smooth number exists.
 * @author Sean A. Irvine
 */
public class A081328 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicBooleanArray mThreeSmooth = new LongDynamicBooleanArray();

  @Override
  public Z next() {
    if (Predicates.SMOOTH.is(3, ++mN)) {
      mThreeSmooth.set(mN);
    }
    for (long k = 1; 2 * k <= mN; ++k) {
      if (mThreeSmooth.isSet(k) && mThreeSmooth.isSet(mN - k)) {
        return Z.valueOf(mN - k);
      }
    }
    return Z.ZERO;
  }
}

