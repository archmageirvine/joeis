package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A049076 Number of steps in the prime index chain for the n-th prime.
 * @author Sean A. Irvine
 */
public class A049076 extends A000040 {

  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000720());

  @Override
  public Z next() {
    long cnt = 0;
    int p = super.next().intValueExact();
    do {
      ++cnt;
      p = mPi.a(p - 1).intValueExact();
    } while (mPrime.isPrime(p));
    return Z.valueOf(cnt);
  }
}
