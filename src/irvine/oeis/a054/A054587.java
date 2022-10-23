package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A054587 n-th occurrence of gap of n between primes occurs at prime a(n), n even, n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A054587 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = 3;
    long m = mN;
    long p0 = 2;
    while (m > 0) {
      p0 = p;
      p = mPrime.nextPrime(p);
      if (p - p0 == mN) {
        --m;
      }
    }
    return Z.valueOf(p0);
  }
}
