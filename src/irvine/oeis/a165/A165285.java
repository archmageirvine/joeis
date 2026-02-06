package irvine.oeis.a165;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A165285 Primes which can be expressed as the sum of 2*p-1 for two or more consecutive primes p.
 * @author Sean A. Irvine
 */
public class A165285 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mSums = new DynamicLongArray();
  private final TreeSet<Long> mS = new TreeSet<>();
  private long mP = 1;

  @Override
  public Z next() {
    while (mS.isEmpty() || 2 * mP - 1 < mS.first()) {
      mP = mPrime.nextPrime(mP);
      final long q = 2 * mP - 1;
      for (int k = 0; k < mSums.length(); ++k) {
        final long s = mSums.add(k, q);
        if (Predicates.PRIME.is(s)) {
          mS.add(s);
        }
      }
      mSums.set(mSums.length(), q); // starting new pairs
    }
    return Z.valueOf(mS.pollFirst());
  }
}
