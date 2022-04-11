package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a002.A002145;

/**
 * A055939 Primes p such that p | ((p-1)/2)! + 1.
 * @author Sean A. Irvine
 */
public class A055939 extends A002145 {

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      final long p = pp.longValueExact();
      long f = 1;
      for (long q = 2; q <= (p - 1) / 2; ++q) {
        f *= q;
        f %= p;
      }
      if (f == p - 1) {
        return pp;
      }
    }
  }
}
