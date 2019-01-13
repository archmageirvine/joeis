package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000204;
import irvine.util.array.LongDynamicLongArray;

/**
 * A003263.
 * @author Sean A. Irvine
 */
public class A003263 extends A000204 {

  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  {
    mCount.set(0, 1L);
  }
  private long mLucas = -1;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN >= mLucas) {
      mLucas = super.next().longValueExact();
      for (long k = mCount.length() - 1, j = k + mLucas; k >= 0; --k, --j) {
        mCount.set(j, mCount.get(j) + mCount.get(k));
      }
    }
    return Z.valueOf(mCount.get(mN));
  }
}

