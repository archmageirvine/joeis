package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030475.
 * @author Sean A. Irvine
 */
public class A030475 extends A000040 {

  static boolean isMixed(Z m) {
    final boolean side = m.isEven();
    do {
      m = m.divide(10);
    } while (!Z.ZERO.equals(m) && m.isEven() == side);
    if (Z.ZERO.equals(m)) {
      return false;
    }
    do {
      m = m.divide(10);
    } while (!Z.ZERO.equals(m) && m.isEven() != side);
    return !Z.ZERO.equals(m);
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
