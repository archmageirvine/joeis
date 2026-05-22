package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084937 Smallest number which is coprime to the last two predecessors and has not yet appeared; a(1)=1, a(2)=2.
 * @author Sean A. Irvine
 */
public class A084937 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mLeastUnused = 3;
  private long mA = 0;
  private long mB = 0;

  @Override
  public Z next() {
    if (mB == 0) {
      if (mA == 0) {
        mA = 1;
        return Z.ONE;
      }
      mB = 2;
      return Z.TWO;
    }
    while (mSeen.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mSeen.isSet(k) && Functions.GCD.l(k, mA) == 1 && Functions.GCD.l(k, mB) == 1) {
        mA = mB;
        mB = k;
        mSeen.set(k);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

