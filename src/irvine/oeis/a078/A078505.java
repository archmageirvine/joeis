package irvine.oeis.a078;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A078505 Possible values for smallest pseudoprime ( &gt; n ) to base n.
 * @author Sean A. Irvine
 */
public class A078505 extends A002808 {

  private final LongDynamicBooleanArray mUsedBases = new LongDynamicBooleanArray();
  private long mLeastUnusedBase = 1;

  @Override
  public Z next() {
    while (true) {
      while (mUsedBases.isSet(mLeastUnusedBase)) {
        ++mLeastUnusedBase;
      }
      final long n = super.next().longValueExact();
      // We need to do the full loop. even if we find a value to ensure we mark
      // bases used at the appropriate time
      long soln = 0;
      for (long base = mLeastUnusedBase; base < n; ++base) {
        if (!mUsedBases.isSet(base) && LongUtils.modPow(base, n - 1, n) == 1) {
          mUsedBases.set(base);
          soln = n;
        }
      }
      if (soln != 0) {
        return Z.valueOf(soln);
      }
    }
  }
}
