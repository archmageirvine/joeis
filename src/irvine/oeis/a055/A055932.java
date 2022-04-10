package irvine.oeis.a055;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055932 Numbers all of whose prime divisors are consecutive primes starting at 2.
 * @author Sean A. Irvine
 */
public class A055932 implements Sequence {

  private final TreeMap<Z, Long> mA = new TreeMap<>();
  private final Fast mPrime = new Fast();
  {
    mA.put(Z.ONE, 1L);
  }

  @Override
  public Z next() {
    final Map.Entry<Z, Long> e = mA.pollFirstEntry();
    final Z n = e.getKey();
    final long p = e.getValue();
    final long np = mPrime.nextPrime(p);
    mA.put(n.multiply(np), np);
    for (long q = 2; q <= p; q = mPrime.nextPrime(q)) {
      mA.put(n.multiply(q), p);
    }
    return n;
  }
}
