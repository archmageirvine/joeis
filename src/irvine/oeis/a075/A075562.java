package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075540.
 * @author Sean A. Irvine
 */
public class A075562 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    long m = 1;
    while (true) {
      if (!mUsed.isSet(++m)) {
        final Z s = mSum.add(m);
        if (Predicates.NONTRIVIAL_PRIME_POWER.is(s)) {
          mSum = s;
          mUsed.set(m);
          return Z.valueOf(m);
        }
      }
    }
  }
}

