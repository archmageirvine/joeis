package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057847 Primes p such that order of primeness A049076(p) is &gt; 10.
 * @author Sean A. Irvine
 */
public class A057847 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      long p = pp.longValueExact();
      do {
        ++cnt;
        p = Functions.PRIME_PI.l(p);
      } while (mPrime.isPrime(p) && cnt < 10);
      if (cnt >= 10) {
        return pp;
      }
    }
  }
}
