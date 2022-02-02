package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054409 Maximal difference between consecutive primes in range [prime(n), prime(n)^2].
 * @author Sean A. Irvine
 */
public class A054409 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p2 = p.square();
    Z q = p;
    long max = 0;
    for (Z r = mPrime.nextPrime(q); r.compareTo(p2) <= 0; r = mPrime.nextPrime(r)) {
      final long gap = r.subtract(q).longValue();
      if (gap > max) {
        max = gap;
      }
      q = r;
    }
    return Z.valueOf(max);
  }
}
