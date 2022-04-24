package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056563 Number of primes which are the difference between two triangular numbers, where the larger is the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A056563 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 2 ? Z.ONE: Z.ZERO;
    }
    long cnt = 0;
    if (mPrime.isPrime(mN)) {
      ++cnt;
    }
    if (mPrime.isPrime(2 * mN - 1)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
