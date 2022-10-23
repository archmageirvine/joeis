package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006307 Number of ways writing 2^n as unordered sums of 2 primes.
 * @author Sean A. Irvine
 */
public class A006307 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z m = mN;
    mN = mN.isZero() ? Z.ONE : mN.multiply2();
    long c = 0;
    for (Z p = Z.TWO; p.compareTo(m) <= 0; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(mN.subtract(p))) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

