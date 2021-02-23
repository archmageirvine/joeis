package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039669 Numbers n &gt; 2 such that n - 2^k is a prime for all k &gt; 0 with 2^k &lt; n.
 * @author Sean A. Irvine
 */
public class A039669 implements Sequence {

  // There is no chance of finding the next term with this!

  private final Fast mPrime = new Fast();
  private long mN = 2;

  private boolean isPrimeChain(final long n) {
    for (long k = 2; k < n; k <<= 1) {
      if (!mPrime.isPrime(n - k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isPrimeChain(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
