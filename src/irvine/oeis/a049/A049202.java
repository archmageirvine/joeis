package irvine.oeis.a049;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049202 Primes p whose order of primeness A049076(p) is &gt;= 6.
 * @author Sean A. Irvine
 */
public class A049202 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      long p = pp.longValueExact();
      do {
        ++cnt;
        p = Puma.primePi(p);
      } while (mPrime.isPrime(p) && cnt < 6);
      if (cnt >= 6) {
        return pp;
      }
    }
  }
}
