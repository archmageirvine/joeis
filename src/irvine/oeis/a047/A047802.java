package irvine.oeis.a047;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A047802 Smallest abundant number (sigma(x) &gt; 2x) which is not divisible by any of the first n primes.
 * @author Sean A. Irvine
 */
public class A047802 extends A001764 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP); // starting prime
    final FactorSequence fs = new FactorSequence();
    fs.add(mP, FactorSequence.PRIME);
    final TreeMap<Z, FactorSequence> sorted = new TreeMap<>();
    sorted.put(fs.product(), fs);
    while (true) {
      final Map.Entry<Z, FactorSequence> top = sorted.pollFirstEntry();
      final FactorSequence f = top.getValue();
      Z m = top.getKey();
      //System.out.println("Expanding: " + m + " -> " + FactorSequence.toString(f));
      if (f.sigma().compareTo(m.multiply2()) > 0) {
        return top.getKey();
      }
      final Z[] q = f.toZArray();
      // Multiply in a new prime
      final FactorSequence f1 = new FactorSequence(f);
      final Z r = mPrime.nextPrime(q[q.length - 1]);
      f1.add(r, FactorSequence.PRIME);
      sorted.put(m.multiply(r), f1);
      // Multiply in further copies of existing primes.
      // Modify f in place (we no longer need it at the end of this loop,
      // because we make copies at insertion).
      // Note prime powers must be non-increasing here
      for (Z p = q[0]; p.compareTo(q[q.length - 1]) <= 0; p = mPrime.nextPrime(p)) {
        m = m.multiply(p);
        f.add(p, FactorSequence.PRIME);
        sorted.put(m, new FactorSequence(f));
      }
    }
  }
}
