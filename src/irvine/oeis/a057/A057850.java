package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A057850 Primes p such that order of primeness A049076(p) is &gt; 8.
 * @author Sean A. Irvine
 */
public class A057850 extends A000040 {

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
      } while (mPrime.isPrime(p) && cnt < 8);
      if (cnt >= 8) {
        return pp;
      }
    }
  }
}
