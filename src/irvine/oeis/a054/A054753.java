package irvine.oeis.a054;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A054753 Numbers which are the product of a prime and the square of a different prime (p^2 * q).
 * @author Sean A. Irvine
 */
public class A054753 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Long, Pair<Long, Long>> mA = new TreeMap<>();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.firstKey() > 2 * mP * mP) {
        mA.put(2 * mP * mP, new Pair<>(mP, 2L));
        mP = mPrime.nextPrime(mP);
      }
      final Map.Entry<Long, Pair<Long, Long>> e = mA.pollFirstEntry();
      final Pair<Long, Long> pq = e.getValue();
      final long nextQ = mPrime.nextPrime(pq.right());
      mA.put(pq.left() * pq.left() * nextQ, new Pair<>(pq.left(), nextQ));
      if (!pq.left().equals(pq.right())) {
        return Z.valueOf(e.getKey());
      }
    }
  }
}
