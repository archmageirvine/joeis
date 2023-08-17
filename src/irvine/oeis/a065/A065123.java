package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065123 Primes which, although they have correct parity, are not in the prime number maze.
 * @author Sean A. Irvine
 */
public class A065123 extends A000040 {

  private long f(final Z p) {
    long s = 0;
    long sign = -1;
    for (int k = 0; k < p.bitLength(); ++k) {
      sign = -sign;
      if (p.testBit(k)) {
        s += sign;
      }
    }
    return s;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.bitLength() > 2 && (p.bitCount() & 1) == (p.mod(3) & 1)) {
        final long f = f(p);
        if (f > 2 || f < 1) {
          return p;
        }
      }
    }
  }
}
