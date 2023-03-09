package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061771 Primes p(k) such that p(k+1) - p(k) = 2^m for some m (smaller of a pair of consecutive primes which differ by a power of 2).
 * @author Sean A. Irvine
 */
public class A061771 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final long d = q.subtract(p).longValueExact();
      if ((d & (d - 1)) == 0) {
        return p;
      }
    }
  }
}
