package irvine.oeis.a074;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A074112 Let omega(m) be the number of distinct prime divisors of m. Then a(n) is the largest n-digit squarefree number such that omega(n) &gt; omega(j) for all j &lt; n.
 * @author Sean A. Irvine
 */
public class A074112 extends Sequence1 implements Conjectural {

  // There must be a better way to do this

  private static final int HEURISTIC_PRIMES = 50;
  private static final int HEURISTIC_TREE = 5000;
  private final Fast mPrime = new Fast();
  private Z mMax = Z.ONE;
  private TreeMap<Z, Long> mCandidates = new TreeMap<>();
  {
    mCandidates.put(Z.SIX, 3L);
  }

  @Override
  public Z next() {
    mMax = mMax.multiply(10);
    final Map.Entry<Z, Long> first = mCandidates.firstEntry();
    final Z t = first.getKey().multiply(mPrime.nextPrime(first.getValue()));
    if (t.compareTo(mMax) < 0) {
      // We can now increase the number of prime factors
      final TreeMap<Z, Long> next = new TreeMap<>();
      int k = 0;
      for (final Map.Entry<Z, Long> e : mCandidates.entrySet()) {
        final Z n = e.getKey();
        long p = e.getValue();
        for (int j = 0; j < HEURISTIC_PRIMES; ++j) {
          p = mPrime.nextPrime(p);
          next.put(n.multiply(p), p);
        }
        if (++k == HEURISTIC_TREE) {
          break;
        }
      }
      mCandidates = next;
    }
    return mCandidates.lowerKey(mMax);
  }
}
