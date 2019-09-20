package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A026191 Position of n in <code>A026190</code>.
 * @author Sean A. Irvine
 */
public class A026191 extends A026190 {

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
