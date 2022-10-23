package irvine.oeis.a048;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048692 Triangle read by rows in which row n contains first n numbers with exactly n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A048692 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final FactorSequence mFirst = new FactorSequence();
  private final TreeMap<Z, FactorSequence> mA = new TreeMap<>();
  private long mP = 1;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      mFirst.add(mP, FactorSequence.PRIME, 1);
      mA.clear();
      mA.put(mFirst.product(), mFirst);
      mM = 0;
    }
    final Map.Entry<Z, FactorSequence> e = mA.pollFirstEntry();
    final FactorSequence fs = e.getValue();
    final Z res = e.getKey();
    // Bump exponents
    for (final Z p : fs.toZArray()) {
      final FactorSequence t = new FactorSequence(fs);
      t.add(p, FactorSequence.PRIME, 1);
      mA.put(res.multiply(p), t);
    }
    // Bump primes
    for (final Z p : fs.toZArray()) {
      final Z q = mPrime.nextPrime(p);
      if (fs.getExponent(q) == 0) {
        // i.e., q not already present
        final FactorSequence t = new FactorSequence(fs);
        t.remove(p);
        t.add(q, FactorSequence.PRIME, 1);
        mA.put(t.product(), t);
      }
    }
    return res;
  }
}

