package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001097 Twin primes.
 * @author Sean A. Irvine
 */
public class A001097 extends AbstractSequence {

  /** Construct the sequence. */
  public A001097() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      if (mPrime.isPrime(mN.add(2)) || mPrime.isPrime(mN.subtract(2))) {
        return mN;
      }
    }
  }
}

