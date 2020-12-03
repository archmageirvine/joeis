package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030475 Primes with property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030475 extends A000040 {

  static boolean isMixed(Z m) {
    final boolean side = m.isEven();
    do {
      m = m.divide(10);
    } while (!m.isZero() && m.isEven() == side);
    if (m.isZero()) {
      return false;
    }
    do {
      m = m.divide(10);
    } while (!m.isZero() && m.isEven() != side);
    return !m.isZero();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!isMixed(p)) {
        return p;
      }
    }
  }
}
