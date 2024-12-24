package irvine.oeis.a073;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A073905 Primes which can be written as a concatenation of p^q and q^p where p and q are primes.
 * @author Sean A. Irvine
 */
public class A073905 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Z, Pair<Long, Long>> mA = new TreeMap<>();
  {
    mA.put(Z.valueOf(89), new Pair<>(2L, 3L));
  }

  private Z value(final long p, final long q) {
    return new Z(Z.valueOf(p).pow(q).toString() + Z.valueOf(q).pow(p));
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, Pair<Long, Long>> e = mA.pollFirstEntry();
      final long p = e.getValue().left();
      final long q = e.getValue().right();
      final long np = mPrime.nextPrime(p);
      final long nq = mPrime.nextPrime(q);
      mA.put(value(np, q), new Pair<>(np, q));
      mA.put(value(p, nq), new Pair<>(p, nq));
      if (e.getKey().isProbablePrime()) {
        return e.getKey();
      }
    }
  }
}

