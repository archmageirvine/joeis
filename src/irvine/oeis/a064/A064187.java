package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064187 First of n^2 consecutive odd primes whose sum (=S) is divisible by n and S/n == n (mod 2).
 * @author Sean A. Irvine
 */
public class A064187 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long m = ++mN * mN;
    long s = 3;
    long p = 3;
    Z sum = Z.ZERO;
    for (long k = 0; k < m; ++k) {
      sum = sum.add(p);
      p = mPrime.nextPrime(p);
    }
    while (true) {
      if (sum.mod(mN) == 0 && sum.divide(mN).testBit(0) == ((mN & 1) == 1)) {
        return Z.valueOf(s);
      }
      sum = sum.subtract(s).add(p);
      s = mPrime.nextPrime(s);
      p = mPrime.nextPrime(p);
    }
  }
}
