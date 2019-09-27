package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A026401 Position of the first n in <code>A026400</code>.
 * @author Sean A. Irvine
 */
public class A026401 extends A026400 {

  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (!mMap.containsKey(mN)) {
      final long s = super.next().longValueExact();
      ++mM;
      if (s >= mN && !mMap.containsKey(s)) {
        mMap.put(s, mM);
      }
    }
    return Z.valueOf(mMap.remove(mN));
  }
}
