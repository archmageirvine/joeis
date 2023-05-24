package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000215;

/**
 * A063897 a(n) is the least k such that k - A000215(j), j=0..n, are all primes.
 * @author Sean A. Irvine
 */
public class A063897 extends Sequence0 {

  private final MemorySequence mFermatPrimes = MemorySequence.cachedSequence(new A000215());
  private int mN = -1;

  private boolean isAllPrime(final Z k) {
    for (int j = 0; j <= mN; ++j) {
      if (!k.subtract(mFermatPrimes.a(j)).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.FIVE; // only odd term
    }
    Z k = mFermatPrimes.a(mN).add(1);
    while (true) {
      k = k.add(2);
      if (isAllPrime(k)) {
        return k;
      }
    }
  }
}
