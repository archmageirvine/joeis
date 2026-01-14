package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083172 Triangle read by rows: T(1, 1) = 1 and for n &gt; 1, T(n, k) = A083167(n, k)/(n-1).
 * @author Sean A. Irvine
 */
public class A083172 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private int mN = 0;
  private int mM = 0;
  private long mLeastUnused = 2;
  private long mRowSum = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 1;
      mRowSum = 0;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = (mLeastUnused / (mN - 1)) * (mN - 1);
    while (true) {
      if (!mUsed.isSet(k)) {
        if (mM < mN || (mRowSum + k) % mN == 0) {
          mRowSum += k;
          mUsed.set(k);
          return Z.valueOf(k / (mN - 1));
        }
      }
      k += mN - 1;
    }
  }
}

