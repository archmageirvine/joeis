package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076173 Primes p such that sum of 4th powers of even-position digits equals the sum of 4th powers of odd-position digits of p.
 * @author Sean A. Irvine
 */
public class A076173 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      long m = p.longValueExact();
      long s = 0;
      long sign = -1;
      while (m != 0) {
        sign = -sign;
        final long r = m % 10;
        final long q = r * r;
        s += sign * q * q;
        m /= 10;
      }
      if (s == 0) {
        return p;
      }
    }
  }
}

