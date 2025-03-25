package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076171 Primes p whose odd-position and even-position digits have the same sum of cubes.
 * @author Sean A. Irvine
 */
public class A076171 extends A000040 {

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
        s += sign * r * r * r;
        m /= 10;
      }
      if (s == 0) {
        return p;
      }
    }
  }
}

