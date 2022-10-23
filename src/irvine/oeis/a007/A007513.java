package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A007513 a(n) = initial prime of n consecutive primes such that first and last have same digit sum.
 * @author Sean A. Irvine
 */
public class A007513 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final long d = ZUtils.digitSum(p);
      long q = p;
      for (long k = 0; k < mN; ++k) {
        q = mPrime.nextPrime(q);
      }
      if (d == ZUtils.digitSum(q)) {
        return Z.valueOf(p);
      }
    }
  }
}
