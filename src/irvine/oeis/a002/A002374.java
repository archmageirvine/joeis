package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002374 Largest prime &lt;= n in any decomposition of 2n into a sum of two odd primes.
 * @author Sean A. Irvine
 */
public class A002374 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    final long m = 2 * ++mN;
    long p = mN + 1;
    while (true) {
      p = mPrime.prevPrime(p);
      if (mPrime.isPrime(m - p)) {
        return Z.valueOf(p);
      }
    }
  }
}
