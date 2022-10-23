package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031944 Numbers in which digits 0,1,2 all occur in base 3.
 * @author Sean A. Irvine
 */
public class A031944 extends Sequence1 {

  private final long mBase;
  private final long mMask;
  private long mN;

  protected A031944(final long base) {
    if (base > 31) {
      throw new UnsupportedOperationException();
    }
    mBase = base;
    mMask = (1L << base) - 1;
    mN = base;
  }

  /** Construct the sequence. */
  public A031944() {
    this(3);
  }

  private boolean isAllDigits(long n) {
    long s = 0;
    while (n != 0) {
      s |= 1L << (n % mBase);
      n /= mBase;
      if (s == mMask) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (!isAllDigits(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
