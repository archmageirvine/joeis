package irvine.oeis.a049;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049078 Primes prime(k) for which A049076(k) = 2.
 * @author Sean A. Irvine
 */
public class A049078 extends A000040 {

  protected int target() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      long p = pp.longValueExact();
      do {
        ++cnt;
        p = Puma.primePi(p);
      } while (mPrime.isPrime(p) && cnt <= target());
      if (cnt == target()) {
        return pp;
      }
    }
  }
}
