package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A026371 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026370</code>.
 * @author Sean A. Irvine
 */
public class A026371 extends A026370 {

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
