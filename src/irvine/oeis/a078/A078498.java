package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A078498 Let q(n) be the prime defined in A078497; sequence gives (q(n)-prime(n))/6.
 * @author Sean A. Irvine
 */
public class A078498 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mP = 7;

  /** Construct the sequence. */
  public A078498() {
    super(5);
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = mP;
    do {
      k = mPrime.nextPrime(k);
    } while (!mPrime.isPrime(k) || !mPrime.isPrime(2 * mP - k));
    return Z.valueOf((k - mP) / 6);
  }
}

