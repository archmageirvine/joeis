package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082737 Triangle read by rows in which the first row contains a 1 and the n-th row contains n primes not included in the previous rows such that the sum of a row is a perfect square.
 * @author Sean A. Irvine
 */
public class A082737 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long mLeastUnused = 2;
  private Z mSum = Z.ZERO;
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.ONE;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mPrime.nextPrime(mLeastUnused);
    }
    if (++mM >= mN) {
      // Complete the row
      long k = mLeastUnused;
      while (true) {
        if (!mUsed.contains(k) && Predicates.SQUARE.is(mSum.add(k))) {
          mUsed.add(k);
          mSum = Z.ZERO;
          mM = -1;
          ++mN;
          return Z.valueOf(k);
        }
        k = mPrime.nextPrime(k);
      }
    }
    mUsed.add(mLeastUnused);
    mSum = mSum.add(mLeastUnused);
    return Z.valueOf(mLeastUnused);
  }
}
