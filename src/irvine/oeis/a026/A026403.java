package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026403 a(n) = position of the n-th n in A026400.
 * @author Sean A. Irvine
 */
public class A026403 extends A026400 {

  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (!mMap.containsKey(mN)) {
      final long s = super.next().longValueExact();
      ++mM;
      if (s >= mN) {
        mCount.set(s, mCount.get(s) + 1);
        if (mCount.get(s) == s) {
          mMap.put(s, mM);
        }
      }
    }
    final Long r = mMap.remove(mN);
    return Z.valueOf(r);
  }
}
