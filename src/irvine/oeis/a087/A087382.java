package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087382 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mQ = 3;
  private long mM = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      while (mM < mP) {
        mQ = mPrime.nextPrime(mQ);
        ++mM;
      }
      if ((mPrime.isPrime(mP - 2) || mPrime.isPrime(mP + 2)) && (mPrime.isPrime(mQ - 2) || mPrime.isPrime(mQ + 2))) {
        return Z.valueOf(mP);
      }
    }
  }
}

