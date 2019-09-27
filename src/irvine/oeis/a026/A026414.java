package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026414 <code>a(n) =</code> greatest integer not found after first n in <code>A026409</code>.
 * @author Sean A. Irvine
 */
public class A026414 extends A026409 {

  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mCount.get(mN) == 0) {
      final long s = super.next().longValueExact();
      mCount.set(s, mCount.get(s) + 1);
    }
    long k = mN;
    while (mCount.get(k) != k) {
      --k;
    }
    return Z.valueOf(k);
  }
}
