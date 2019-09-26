package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A026355 <code>a(n) =</code> least k such that <code>s(k) = n+1</code>, where s <code>= A026354</code>.
 * @author Sean A. Irvine
 */
public class A026355 extends A026354 {

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
