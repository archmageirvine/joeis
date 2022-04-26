package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056564 Number of times primes can be produced by taking the absolute difference between the n-th triangular number and another triangular number.
 * @author Sean A. Irvine
 */
public class A056564 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 2 ? Z.THREE : Z.ONE;
    }
    long cnt = 0;
    if (mPrime.isPrime(mN)) {
      ++cnt;
    }
    if (mPrime.isPrime(mN + 1)) {
      ++cnt;
    }
    if (mPrime.isPrime(2 * mN - 1)) {
      ++cnt;
    }
    if (mPrime.isPrime(2 * mN + 3)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
