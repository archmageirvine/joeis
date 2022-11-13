package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicIntArray;

/**
 * A060378 Even-odd sieve.
 * @author Sean A. Irvine
 */
public class A060378 extends Sequence2 {

  private long mN = 0;
  private int mNumbersOutput = 0;
  private final DynamicIntArray mDownCounters = new DynamicIntArray();
  private int mMaxCounter = 0;
  private int mNextCounterStart = 2;

  private boolean isSkipped() {
    for (int k = 0; k < mMaxCounter; ++k) {
      final int c = mDownCounters.get(k) - 1;
      mDownCounters.set(k, c);
      if (c <= 0) {
        mDownCounters.set(k, 2 * (k + 1) + 1);
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mNumbersOutput == mNextCounterStart) {
        ++mMaxCounter;
        mNextCounterStart += 2;
      }
      if (!isSkipped()) {
        ++mNumbersOutput;
        return Z.valueOf(2L * mN);
      }
    }
  }
}
