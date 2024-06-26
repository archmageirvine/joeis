package irvine.oeis.a061;

import java.util.HashMap;
import java.util.Map;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.partition.IntegerPartition;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061707 Smallest number with exactly n^2 divisors.
 * @author Sean A. Irvine
 */
public class A061707 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Map<Long, Z> mFirsts = new HashMap<>();
  private long mN = 0;
  private int mM = 0;
  {
    mFirsts.put(1L, Z.ONE);
  }

  // Only the prime signature is needed, we compute 2^a * 3^b * 5^c * ... with a > b > c > ...

  @Override
  public Z next() {
    ++mN;
    final long s = mN * mN;
    do { // Always do at least one more step
      final IntegerPartition part = new IntegerPartition(++mM);
      int[] pt;
      while ((pt = part.next()) != null) {
        long p = 1;
        final FactorSequence fs = new FactorSequence();
        for (final int e : pt) {
          p = mPrime.nextPrime(p);
          fs.add(p, FactorSequence.PRIME, e);
        }
        final Z sigma0z = fs.sigma0();
        if (sigma0z.bitLength() <= 63) { // unlikely we will generate this far
          final long sigma0 = sigma0z.longValue();
          if (Predicates.SQUARE.is(sigma0)) {
            final Z f = mFirsts.get(sigma0);
            if (f == null) {
              mFirsts.put(sigma0, fs.product());
            } else {
              final Z prod = fs.product();
              if (prod.compareTo(f) < 0) {
                mFirsts.put(sigma0, fs.product());
              }
            }
          }
        }
      }
    } while (mFirsts.get(s) == null);
    return mFirsts.get(s);
  }
}
