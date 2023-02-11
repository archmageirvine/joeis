package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a045.A045917;

/**
 * A061358 Number of ways of writing n = p+q with p, q primes and p &gt;= q.
 * @author Sean A. Irvine
 */
public class A061358 extends A045917 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0 || (mN & 1) == 1) {
      return mPrime.isPrime(mN - 2) ? Z.ONE : Z.ZERO;
    } else {
      return super.next();
    }
  }
}

