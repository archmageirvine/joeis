package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081983 Primes p such that p-1 is divisible by every nonzero digit of p.
 * @author Sean A. Irvine
 */
public class A081983 extends A000040 {

  private boolean is(final Z p) {
    long pp = p.longValue();
    final long p1 = pp - 1;
    while (pp != 0) {
      final long r = pp % 10;
      if (r != 0 && p1 % r != 0) {
        return false;
      }
      pp /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
