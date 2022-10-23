package irvine.oeis.a036;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036668 Hati numbers: of form 2^i*3^j*k, i+j even, (k,6)=1.
 * @author Sean A. Irvine
 */
public class A036668 extends Sequence0 {

  private final TreeMap<Z, Long> mPriority = new TreeMap<>();
  {
    mPriority.put(Z.ONE, 1L);
  }

  @Override
  public Z next() {
    final Map.Entry<Z, Long> e = mPriority.pollFirstEntry();
    final Z r = e.getKey();
    final long u = e.getValue();
    long v = u;
    if (v == 1) {
      mPriority.put(r.multiply(4), 1L);
      mPriority.put(r.multiply(6), 1L);
      mPriority.put(r.multiply(9), 1L);
    }
    while (LongUtils.gcd(++v, 6) != 1) {
      // do nothing
    }
    mPriority.put(r.divide(u).multiply(v), v);
    return r;
  }
}
