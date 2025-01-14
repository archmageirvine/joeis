package irvine.oeis.a074;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A074173 Numbers n such that n and n+2 are of the form p^2*q where p and q are distinct primes.
 * @author Sean A. Irvine
 */
public class A074173 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Z, Pair<Long, Long>> mA = new TreeMap<>();
  {
    mA.put(Z.EIGHT, new Pair<>(2L, 2L));
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, Pair<Long, Long>> e = mA.pollFirstEntry();
      final Z n = e.getKey();
      final long p = e.getValue().left();
      final long pp = mPrime.nextPrime(p);
      final long q = e.getValue().right();
      final long qq = mPrime.nextPrime(q);
      if (p != qq) {
        mA.put(Z.valueOf(p).square().multiply(qq), new Pair<>(p, qq));
      }
      if (pp != q) {
        mA.put(Z.valueOf(pp).square().multiply(q), new Pair<>(pp, q));
      }
      if (mA.containsKey(n.add(2))) {
        return n;
      }
    }
  }
}
