package irvine.oeis.a000;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A000961 Powers of primes. Alternatively, 1 and the prime powers (p^k, p prime, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A000961 extends A000040 {

  private final TreeMap<Z, Pair<Long, Long>> mMap = new TreeMap<>();
  protected final Fast mPrime = new Fast();
  private long mP = 1;
  {
    mMap.put(Z.ONE, new Pair<>(1L, 1L));
  }

  /**
   * Return the next number (including information about base and exponent).
   * @return next number
   */
  public Map.Entry<Z, Pair<Long, Long>> nextEntry() {
    final Map.Entry<Z, Pair<Long, Long>> entry = mMap.pollFirstEntry();
    final Z n = entry.getKey();
    final Pair<Long, Long> be = entry.getValue();
    final long base = be.left();
    final long exponent = be.right();
    if (base != 1) {
      // Move up to the next power
      mMap.put(n.multiply(base), new Pair<>(base, exponent + 1));
    }
    if (exponent == 1) {
      mP = mPrime.nextPrime(mP);
      mMap.put(Z.valueOf(mP), new Pair<>(mP, 1L));
    }
    return entry;
  }

  @Override
  public Z next() {
    return nextEntry().getKey();
  }
}

