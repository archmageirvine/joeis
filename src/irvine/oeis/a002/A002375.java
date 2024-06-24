package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A002375 From Goldbach conjecture: number of decompositions of 2n into an unordered sum of two odd primes.
 * @author Sean A. Irvine
 */
public class A002375 extends Sequence1 implements DirectSequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return al(++mN);
  }

  @Override
  public Z a(final Z n) {
    return al(n.longValueExact());
  }

  @Override
  public Z a(final int n) {
    return al(n);
  }

  private Z al(final long n) {
    final long m = 2 * n;
    long c = 0;
    for (long p = 3; p <= n; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(m - p)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }

}
