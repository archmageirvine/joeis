package irvine.oeis.a061;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061781 extends Sequence1 {

  private final HashSet<Long> mSums = new HashSet<>();
  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mSums.add(2 * mP);
    for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
      mSums.add(mP + q);
    }
    return Z.valueOf(mSums.size());
  }
}

