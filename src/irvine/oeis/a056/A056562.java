package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056562 Number of primes which are the difference between two triangular numbers, where the smaller is the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A056562 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    long cnt = 0;
    if (mPrime.isPrime(mN + 1)) {
      ++cnt;
    }
    if (mPrime.isPrime(2 * mN + 3)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
