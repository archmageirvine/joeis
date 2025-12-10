package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A082467 Least k&gt;0 such that n-k and n+k are both primes.
 * @author Sean A. Irvine
 */
public class A082467 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  /** Construct the sequence. */
  public A082467() {
    super(4);
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (mPrime.isPrime(mN - k) && mPrime.isPrime(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}

