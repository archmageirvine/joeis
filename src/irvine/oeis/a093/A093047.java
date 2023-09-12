package irvine.oeis.a093;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A093047 Primes p such that order of primeness A049076(p) is &gt; 12.
 * @author Sean A. Irvine
 */
public class A093047 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      long p = pp.longValueExact();
      do {
        ++cnt;
        p = Puma.primePi(p);
      } while (mPrime.isPrime(p) && cnt < 12);
      if (cnt >= 12) {
        return pp;
      }
    }
  }
}
