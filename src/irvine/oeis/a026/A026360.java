package irvine.oeis.a026;

import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A026360 a(n) = greatest k such that s(k) = n, where s = A026358.
 * @author Sean A. Irvine
 */
public class A026360 extends A026358 {

  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private final TreeSet<Long> mSeenFirst = new TreeSet<>();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (!mMap.containsKey(mN)) {
      final long s = super.next().longValueExact();
      ++mM;
      if (s >= mN && !mSeenFirst.add(s)) {
        mMap.put(s, mM);
      }
    }
    final Long r = mMap.remove(mN);
    mSeenFirst.remove(r);
    return Z.valueOf(r);
  }
}
