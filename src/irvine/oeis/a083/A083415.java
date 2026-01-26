package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083415 Triangle read by rows: T(n,k) is defined as follows. Write the numbers from 1 to n^2 consecutively in n rows of length n; T(n,k) = number of primes in k-th row.
 * @author Sean A. Irvine
 */
public class A083415 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mM = 0;
  private long mP = 2;

  @Override
  public Z next() {
    mM += mN;
    if (mM > mN * mN) {
      ++mN;
      mM = mN;
      mP = 2;
    }
    int cnt = 0;
    while (mP <= mM) {
      ++cnt;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(cnt);
  }
}
