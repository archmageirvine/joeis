package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026405 a(n) = greatest integer not found after first n in A026400.
 * @author Sean A. Irvine
 */
public class A026405 extends A026400 {

  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mCount.get(mN) == 0) {
      mCount.increment(super.next().longValueExact());
    }
    long k = mN;
    while (mCount.get(k) != k) {
      --k;
    }
    return Z.valueOf(k);
  }
}
