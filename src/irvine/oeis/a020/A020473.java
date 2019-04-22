package irvine.oeis.a020;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020473.
 * @author Sean A. Irvine
 */
public class A020473 implements Sequence {

  // Too slow to be useful

  private Map<Q, Z> mCounts = Collections.singletonMap(Q.ZERO, Z.ONE);
  private long mN = 0;

  private void inc(final Map<Q, Z> map, final Q q, final Z inc) {
    final Z cnt = map.get(q);
    map.put(q, cnt == null ? inc : cnt.add(inc));
  }

  @Override
  public Z next() {
    ++mN;
    final HashMap<Q, Z> newCounts = new HashMap<>(mCounts);
    for (int k = 1; k <= mN; ++k) {
      final Q q = new Q(k, mN);
      for (final Map.Entry<Q, Z> e : mCounts.entrySet()) {
        final Q r = e.getKey().add(q);
        if (r.compareTo(Q.ONE) <= 0) {
          inc(newCounts, r, e.getValue());
        }
      }
    }
    mCounts = newCounts;
    return mCounts.get(Q.ONE);
  }
}
