package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026404 a(n) = greatest number of numbers between consecutive appearances of n in A026400.
 * @author Sean A. Irvine
 */
public class A026404 extends A026400 {

  /** Construct the sequence. */
  public A026404() {
    super(2);
  }

  private final LongDynamicLongArray mPrev = new LongDynamicLongArray();
  private final LongDynamicLongArray mMax = new LongDynamicLongArray();
  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mCount.get(mN) != mN) {
      ++mM;
      final long s = super.next().longValueExact();
      if (mPrev.get(s) != 0) {
        mMax.set(s, Math.max(mMax.get(s), mM - mPrev.get(s) - 1));
      }
      mPrev.set(s, mM);
      mCount.set(s, mCount.get(s) + 1);
    }
    return Z.valueOf(mMax.get(mN));
  }
}
