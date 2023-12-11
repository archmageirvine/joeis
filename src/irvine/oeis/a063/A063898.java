package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000215;
import irvine.oeis.memory.MemorySequence;

/**
 * A063898 Smallest k &gt; 0 such that k + F_n are all primes, where F_n is the n-th Fermat number.
 * @author Sean A. Irvine
 */
public class A063898 extends Sequence0 {

  private final MemorySequence mFermatPrimes = MemorySequence.cachedSequence(new A000215());
  private int mN = -1;

  private boolean isAllPrime(final Z k) {
    for (int j = 0; j <= mN; ++j) {
      if (!k.add(mFermatPrimes.a(j)).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ZERO;
    while (true) {
      k = k.add(2);
      if (isAllPrime(k)) {
        return k;
      }
    }
  }
}
