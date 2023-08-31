package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A065371 a(1) = 1, a(prime(i)) = prime(i) - i for i &gt; 0 and a(u * v) = a(u) * a(v) for u, v &gt; 0.
 * @author Sean A. Irvine
 */
public class A065371 extends MemorySequence {

  private final Fast mPrime = new Fast();
  private long mPrimeCount = 0;
  {
    add(null);
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    if (mPrime.isPrime(n)) {
      return Z.valueOf(n - ++mPrimeCount);
    }
    int k = 1;
    while (true) {
      if (n % ++k == 0) {
        return a(n / k).multiply(a(k));
      }
    }
  }
}
