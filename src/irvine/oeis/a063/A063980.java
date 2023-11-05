package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063980 Pillai primes: primes p such that there exists an integer m such that m! + 1 == 0 (mod p) and p != 1 (mod m).
 * @author Sean A. Irvine
 */
public class A063980 extends A000040 {

  protected Z select(final Z p, final long m) {
    return p;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long lp = p.longValueExact();
      long t = 5040 % lp;
      for (long m = 8; m < lp - 1; ++m) {
        t *= m;
        t %= lp;
        if (t == lp - 1 && lp % m != 1) {
          return select(p, m);
        }
      }
    }
  }
}
