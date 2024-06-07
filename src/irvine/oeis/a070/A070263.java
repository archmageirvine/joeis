package irvine.oeis.a070;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070258 Smallest of 3 consecutive numbers each divisible by a square.
 * @author Sean A. Irvine
 */
public class A070263 extends Sequence1 {

  // Brute force

  private int mN = 0;
  private long mM = 0;
  private Map<Set<Long>, Integer> mState = new HashMap<>();

  @Override
  public Z next() {
    long lim = 1L << mN;
    if (++mM > lim) {
      ++mN;
      mM = 1;
      lim <<= 1;
      mState = new HashMap<>();
    }
    if (mState.isEmpty()) {
      // i.e. mM = 1
      for (long v = 0; v < lim; ++v) {
        mState.put(Collections.singleton(v), 0);
      }
    } else {
      final HashMap<Set<Long>, Integer> newState = new HashMap<>();
      // Try adding one more vector to each existing state and update the distance sum
      for (final Map.Entry<Set<Long>, Integer> e : mState.entrySet()) {
        final Set<Long> s = e.getKey();
        final int dist = e.getValue();
        for (long u = 0; u < lim; ++u) {
          if (!s.contains(u)) {
            final HashSet<Long> ns = new HashSet<>(s);
            ns.add(u);
            if (!newState.containsKey(ns)) {
              int t = dist;
              for (final long w : s) {
                t += Long.bitCount(w ^ u);
              }
              newState.put(ns, t);
            }
          }
        }
      }
      mState = newState;
    }
    int min = Integer.MAX_VALUE;
    for (final int v : mState.values()) {
      if (v < min) {
        min = v;
      }
    }
    return Z.valueOf(min);
  }
}
