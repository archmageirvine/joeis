package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A389946 Minimum positive value k such that prime(n) - k^2 is a prime number, or 0 if no such positive k exists.
 * @author Sean A. Irvine
 */
public class A389946 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 0;
    while (true) {
      final Z q = p.subtract(++k * k);
      if (q.signum() <= 0) {
        return Z.ZERO;
      }
      if (q.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

