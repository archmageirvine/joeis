package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.util.array.DynamicIntArray;

/**
 * A060390 Fibonacci sieve: using Fibonacci numbers, strike out every 2nd, 3rd, 5th, 8th, 13th, 21st, 34th... of those remaining.
 * @author Sean A. Irvine
 */
public class A060390 extends A000045 {

  private int mNumbersOutput = 0;
  private final DynamicIntArray mDownCounters = new DynamicIntArray();
  private int mMaxCounter = 0;
  private int mFiboPos = 3;
  private int mNextCounterStart = 1;

  private boolean isSkipped() {
    for (int k = 0; k < mMaxCounter; ++k) {
      final int c = mDownCounters.get(k) - 1;
      mDownCounters.set(k, c);
      if (c <= 0) {
        mDownCounters.set(k, Functions.FIBONACCI.i(k + 3));
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (mNumbersOutput == mNextCounterStart) {
        ++mMaxCounter;
        final long n = ++mFiboPos;
        mNextCounterStart = Functions.FIBONACCI.i(n) - 1;
      }
      if (!isSkipped()) {
        ++mNumbersOutput;
        return f;
      }
    }
  }
}
