package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A058332 Primes p such that order of primeness A049076(p) is &gt; 11.
 * @author Sean A. Irvine
 */
public class A058332 extends A000040 {

  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000720());

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      int p = pp.intValueExact();
      do {
        ++cnt;
        p = mPi.a(p - 1).intValueExact();
      } while (mPrime.isPrime(p) && cnt < 11);
      if (cnt >= 11) {
        return pp;
      }
    }
  }
}
