package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083167 Triangle read by rows in which from the second row onwards the n-th row contains n smallest multiples of (n-1) not included earlier such that the row sum is a multiple of n. Triangle begins with 1.
 * @author Sean A. Irvine
 */
public class A083167 extends Sequence1 {

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
    if (k < mLeastUnused) {
      k += mN - 1;
    }
    while (true) {
      if (!mUsed.isSet(k)) {
        if (mM < mN || (mRowSum + k) % mN == 0) {
          mRowSum += k;
          mUsed.set(k);
          return Z.valueOf(k);
        }
      }
      k += mN - 1;
    }
  }
}

