package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049090 Primes for which A049076 &gt;= 4.
 * @author Sean A. Irvine
 */
public class A049090 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      long p = pp.longValueExact();
      do {
        ++cnt;
        p = Functions.PRIME_PI.l(p);
      } while (mPrime.isPrime(p) && cnt < 4);
      if (cnt >= 4) {
        return pp;
      }
    }
  }
}
