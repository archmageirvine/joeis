package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A049078 Primes prime(k) for which A049076(k) = 2.
 * @author Sean A. Irvine
 */
public class A049078 extends A000040 {

  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000720());

  protected int target() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      int p = pp.intValueExact();
      do {
        ++cnt;
        p = mPi.a(p - 1).intValueExact();
      } while (mPrime.isPrime(p) && cnt <= target());
      if (cnt == target()) {
        return pp;
      }
    }
  }
}
