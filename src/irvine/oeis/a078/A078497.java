package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A078497 The member r of a triple of primes (p,q,r) in arithmetic progression which sum to 3*prime(n) = A001748(n) = p + q + r.
 * @author Sean A. Irvine
 */
public class A078497 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  /** Construct the sequence. */
  public A078497() {
    super(3);
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = mP;
    do {
      k = mPrime.nextPrime(k);
    } while (!mPrime.isPrime(k) || !mPrime.isPrime(2 * mP - k));
    return Z.valueOf(k);
  }
}

