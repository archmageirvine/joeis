package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076168 Primes p such that sum of squares of even-position digits equals the sum of squares of odd-position digits of p.
 * @author Sean A. Irvine
 */
public class A076168 extends A000040 {

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
        s += sign * r * r;
        m /= 10;
      }
      if (s == 0) {
        return p;
      }
    }
  }
}

