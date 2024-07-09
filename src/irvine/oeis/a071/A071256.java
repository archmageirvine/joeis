package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071256 Smallest multiple of n sandwiched between twin primes.
 * @author Sean A. Irvine
 */
public class A071256 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    // All solutions are necessarily even
    final long m = (mN & 1) == 1 ? 2 * mN : mN;
    long k = m;
    while (true) {
      if (mPrime.isPrime(k - 1) && mPrime.isPrime(k + 1)) {
        return Z.valueOf(k);
      }
      k += m;
    }
  }
}
