package irvine.oeis.a058;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058332 Primes p such that order of primeness A049076(p) is &gt; 11.
 * @author Sean A. Irvine
 */
public class A058332 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      long p = pp.longValueExact();
      do {
        ++cnt;
        p = Puma.primePi(p);
      } while (mPrime.isPrime(p) && cnt < 11);
      if (cnt >= 11) {
        return pp;
      }
    }
  }
}
