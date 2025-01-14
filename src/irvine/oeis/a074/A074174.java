package irvine.oeis.a074;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A074174 Smallest number k such that k and k+n are of the form p^2*q where p and q are primes.
 * @author Sean A. Irvine
 */
public class A074174 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeMap<Z, Pair<Long, Long>> a = new TreeMap<>();
    a.put(Z.EIGHT, new Pair<>(2L, 2L));
    while (true) {
      final Map.Entry<Z, Pair<Long, Long>> e = a.pollFirstEntry();
      final Z k = e.getKey();
      final long p = e.getValue().left();
      final long pp = mPrime.nextPrime(p);
      final long q = e.getValue().right();
      final long qq = mPrime.nextPrime(q);
      if (p != qq) {
        a.put(Z.valueOf(p).square().multiply(qq), new Pair<>(p, qq));
      }
      if (pp != q) {
        a.put(Z.valueOf(pp).square().multiply(q), new Pair<>(pp, q));
      }
      if (!Z.EIGHT.equals(k)) {
        final FactorSequence fs = Jaguar.factor(k.add(mN));
        if (fs.omega() == 2 && fs.bigOmega() == 3) {
          return k;
        }
      }
    }
  }
}
