package irvine.oeis.a038;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038609 Numbers that are the sum of 2 different primes.
 * @author Sean A. Irvine
 */
public class A038609 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mA = new TreeSet<>();
  private long mP = 2;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first() > mP + 2) {
      mP = mPrime.nextPrime(mP);
      for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
        mA.add(mP + q);
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
