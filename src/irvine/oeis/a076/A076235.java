package irvine.oeis.a076;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;

/**
 * A076235 Least of the least frequent values in rows of A076221.
 * @author Sean A. Irvine
 */
public class A076235 extends A076221 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Map<Z, Long> counts = new HashMap<>();
    for (long k = 0; k < mN; ++k) {
      counts.merge(super.next(), 1L, Long::sum);
    }
    Z minKey = null;
    long minCount = Long.MAX_VALUE;
    for (final Map.Entry<Z, Long> e : counts.entrySet()) {
      if (e.getValue() <= minCount) {
        if (e.getValue() < minCount || e.getKey().compareTo(minKey) < 0) {
          minKey = e.getKey();
          minCount = e.getValue();
        }
      }
    }
    return minKey;
  }
}
