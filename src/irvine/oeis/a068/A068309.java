package irvine.oeis.a068;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;
import irvine.util.array.LongDynamicArray;

/**
 * A068309 Number of different lucky numbers occurring when 2n is expressed as p1+q1 = ... = pk+qk where pk,qk are lucky numbers with pk &lt;= qk.
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

