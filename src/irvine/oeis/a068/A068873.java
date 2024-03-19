package irvine.oeis.a068;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A068838.
 * @author Sean A. Irvine
 */
public class A068873 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private final Map<Long, Set<Integer>> mWays = new TreeMap<>();
  private int mN = 0;
  private long mP = 1;

  private void update(final Map<Long, Set<Integer>> map, final long sum, final int ways) {
    if (mPrime.isPrime(sum)) {
      final long f = mFirsts.get(ways);
      if (f == 0 || sum < f) {
        mFirsts.set(ways, sum);
      }
    }
    final Set<Integer> w = map.get(sum);
    if (w != null) {
      w.add(ways);
    } else {
      final Set<Integer> v = new HashSet<>();
      v.add(ways);
      map.put(sum, v);
    }
  }

  private long minLimit(final int n, long s) {
    // s - sum p_i
    long p = 2;
    for (int k = 1; k < n; ++k, p = mPrime.nextPrime(p)) {
      s -= p;
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0 || minLimit(mN, mP) < mFirsts.get(mN)) {
      mP = mPrime.nextPrime(mP);
      final Map<Long, Set<Integer>> updates = new HashMap<>();
      for (final Map.Entry<Long, Set<Integer>> e : mWays.entrySet()) {
        final long k = e.getKey();
        final Set<Integer> s = e.getValue();
        for (final int v : s) {
          update(updates, k + mP, v + 1);
        }
      }
      for (final Map.Entry<Long, Set<Integer>> e : updates.entrySet()) {
        final long k = e.getKey();
        final Set<Integer> s = mWays.get(k);
        if (s == null) {
          mWays.put(k, e.getValue());
        } else {
          s.addAll(e.getValue());
        }
      }
      update(mWays, mP, 1); // start the count at 1 for the new prime
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
