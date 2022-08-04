package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a002.A002145;

/**
 * A058302 Primes p such that p | ((p-1)/2)! -1.
 * @author Sean A. Irvine
 */
public class A058302 extends A002145 {

  @Override
  public Z next() {
    while (true) {
      final Z q = super.next();
      final long p = q.longValueExact();
      long f = 1;
      for (long k = 2; k <= (p - 1) / 2; ++k) {
        f *= k;
        f %= p;
      }
      if (f == 1) {
        return q;
      }
    }
  }
}
