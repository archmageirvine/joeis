package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A026195 <code>a(n) =</code> position of n in <code>A026194</code>.
 * @author Sean A. Irvine
 */
public class A026195 extends A026194 {

  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (!mMap.containsKey(mN)) {
      mMap.put(super.next().longValueExact(), ++mM);
    }
    return Z.valueOf(mMap.remove(mN));
  }
}
