package irvine.math;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.util.Pair;

/**
 * Provide convenient way of iterating integers <code>p^n</code> in order.
 * @author Sean A. Irvine
 */
public class PrimePowers {

  private final TreeMap<Long, Pair<Long, Long>> mMap = new TreeMap<>();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  {
    mMap.put(1L, new Pair<>(1L, 1L));
  }

  /**
   * Return the next number (including information about base and exponent).
   * @return next number
   */
  public Map.Entry<Long, Pair<Long, Long>> next() {
    final Map.Entry<Long, Pair<Long, Long>> entry = mMap.pollFirstEntry();
    final long n = entry.getKey();
    final Pair<Long, Long> be = entry.getValue();
    final long base = be.left();
    final long exponent = be.right();
    if (base != 1) {
      // Move up to the next power
      mMap.put(n * base, new Pair<>(base, exponent + 1));
    }
    if (exponent == 1) {
      mP = mPrime.nextPrime(mP);
      mMap.put(mP, new Pair<>(mP, 1L));
    }
    return entry;
  }
}
