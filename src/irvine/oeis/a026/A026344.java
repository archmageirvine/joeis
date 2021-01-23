package irvine.oeis.a026;

import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A026344 a(n) = greatest k such that s(k) = n, where s = A026342.
 * @author Sean A. Irvine
 */
public class A026344 extends A026342 {

  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private final TreeSet<Long> mSeenFirst = new TreeSet<>();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
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
