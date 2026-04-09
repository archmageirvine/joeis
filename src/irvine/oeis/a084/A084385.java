package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084385 a(1) = 1; a(n+1) is the smallest number not occurring earlier and coprime to Sum_{j=1..n} a(j).
 * @author Sean A. Irvine
 */
public class A084385 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 1;

  @Override
  public Z next() {
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k) && Functions.GCD.z(mSum, k).isOne()) {
        mUsed.set(k);
        mSum = mSum.add(k);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
