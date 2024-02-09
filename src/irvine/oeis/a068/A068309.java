package irvine.oeis.a068;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;
import irvine.util.array.LongDynamicArray;

/**
 * A002850 Number of decompositions of 2n into sum of 2 lucky numbers.
 * @author Sean A. Irvine
 */
public class A068309 extends A000959 {

  private long mN = 0;
  private final LongDynamicArray<Set<Long>> mCount = new LongDynamicArray<>();
  private long mLast = 0;

  @Override
  public Z next() {
    final long n = 2 * ++mN;
    while (n > mLast) {
      mLast = super.next().longValueExact();
      for (long k = 0; k < mLucky.length(); ++k) {
        final long v = mLast + mLucky.get(k);
        Set<Long> set = mCount.get(v);
        if (set == null) {
          set = new HashSet<>();
          mCount.set(v, set);
        }
        set.add(mLast);
        set.add(mLucky.get(k));
      }
    }
    return Z.valueOf(mCount.get(n).size());
  }
}

