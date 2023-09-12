package irvine.oeis.a057;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057849 Primes p such that order of primeness A049076(p) is &gt; 7.
 * @author Sean A. Irvine
 */
public class A057849 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      long p = pp.longValueExact();
      do {
        ++cnt;
        p = Puma.primePi(p);
      } while (mPrime.isPrime(p) && cnt < 7);
      if (cnt >= 7) {
        return pp;
      }
    }
  }
}
