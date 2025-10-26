package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081349.
 * @author Sean A. Irvine
 */
public class A389881 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mA = 3;
  private long mMinimumUnused = 2;

  @Override
  public Z next() {
    if (++mN == 1) {
      mUsed.set(3);
      return Z.THREE;
    }
    while (mUsed.isSet(mMinimumUnused)) {
      ++mMinimumUnused;
    }
    long k = mMinimumUnused;
    while (true) {
      if (k != mN && !mUsed.isSet(k) && Functions.GCD.l(mN, k) > Functions.GCD.l(mA, k)) {
        mUsed.set(k);
        mA = k;
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

