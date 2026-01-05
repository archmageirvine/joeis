package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083016 Rearrangement of primes such that the sum of two consecutive terms is a square.
 * @author Sean A. Irvine
 */
public class A083016 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mA = 0;
  private long mLeastUnused = 3;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 2;
      return Z.TWO;
    }
    while (mSeen.remove(mLeastUnused)) {
      mLeastUnused = mPrime.nextPrime(mLeastUnused);
    }
    long k = mLeastUnused;
    while (true) {
      if (Predicates.SQUARE.is(mA + k) && mSeen.add(k)) {
        mA = k;
        return Z.valueOf(k);
      }
      k = mPrime.nextPrime(k);
    }
  }
}
