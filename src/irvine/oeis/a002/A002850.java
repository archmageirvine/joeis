package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;
import irvine.util.array.LongDynamicIntArray;


/**
 * A002850 Number of decompositions of 2n into sum of 2 lucky numbers.
 * @author Sean A. Irvine
 */
public class A002850 extends A000959 {

  private long mN = 0;
  private final LongDynamicIntArray mCount = new LongDynamicIntArray();
  private long mLast = 0;

  @Override
  public Z next() {
    final long n = 2 * ++mN;
    while (n > mLast) {
      mLast = super.next().longValueExact();
      for (long k = 0; k < mLucky.length(); ++k) {
        mCount.increment(mLast + mLucky.get(k));
      }
    }
    return Z.valueOf(mCount.get(n));
  }
}

