package irvine.oeis.a026;

import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A026402 Position of the second n in A026400.
 * @author Sean A. Irvine
 */
public class A026402 extends A026400 {

  private final TreeSet<Long> mSeenFirst = new TreeSet<>();
  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (!mMap.containsKey(mN)) {
      final long s = super.next().longValueExact();
      ++mM;
      if (s >= mN && !mMap.containsKey(s) && !mSeenFirst.add(s)) {
        mMap.put(s, mM);
      }
    }
    mSeenFirst.remove(mN);
    return Z.valueOf(mMap.remove(mN));
  }
}
