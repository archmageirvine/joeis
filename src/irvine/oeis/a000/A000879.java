package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000879 Number of primes &lt; prime(n)^2.
 * @author Sean A. Irvine
 */
public class A000879 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 2;
  private long mC = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long lim = mP * mP;
    while (mN < lim) {
      ++mC;
      mN = mPrime.nextPrime(mN);
    }
    return Z.valueOf(mC);
  }
}

