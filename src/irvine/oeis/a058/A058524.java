package irvine.oeis.a058;

import java.util.HashMap;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058515.
 * @author Sean A. Irvine
 */
public class A058524 implements Sequence {

  private HashMap<Q, Long> mCounts = new HashMap<>();
  private long mN = 0;

  private void insert(final HashMap<Q, Long> newCounts, final Q n, final long v) {
    final Long c = newCounts.get(n);
    newCounts.put(n, c == null ? v : c + v);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mCounts.put(Q.ONE, 1L);
    } else {
      final HashMap<Q, Long> newCounts = new HashMap<>();
      for (final Map.Entry<Q, Long> e : mCounts.entrySet()) {
        final Q k = e.getKey();
        final long v = e.getValue();
        insert(newCounts, k.multiply(mN), v);
        insert(newCounts, k.divide(mN), v);
      }
      mCounts = newCounts;
    }

    long cnt = 0;
    for (final Map.Entry<Q, Long> e : mCounts.entrySet()) {
      if (e.getKey().isInteger()) {
        cnt += e.getValue();
      }
    }
    return Z.valueOf(cnt);
  }
}
