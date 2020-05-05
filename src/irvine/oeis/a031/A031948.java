package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031948 Numbers in which the number of distinct base 3 digits is 2.
 * @author Sean A. Irvine
 */
public class A031948 implements Sequence {

  private final long mBase;
  private final int mDistinctDigitCount;
  private long mN = 0;

  protected A031948(final long base, final int count) {
    mBase = base;
    mDistinctDigitCount = count;
  }

  /** Construct the sequence. */
  public A031948() {
    this(3, 2);
  }

  private boolean isRequiredDigitCount(long n) {
    long s = 0;
    while (n != 0) {
      s |= 1L << (n % mBase);
      n /= mBase;
      if (Long.bitCount(s) > mDistinctDigitCount) {
        return false;
      }
    }
    return Long.bitCount(s) == mDistinctDigitCount;
  }

  @Override
  public Z next() {
    while (!isRequiredDigitCount(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
