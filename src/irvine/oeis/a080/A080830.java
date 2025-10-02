package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080830 extends A000040 {

  private static final Z Z17 = Z.valueOf(17);

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z m = p;
      while (!m.isOne() && !Z.FIVE.equals(m) && !Z17.equals(m)) {
        m = m.isEven() ? m.divide2() : m.multiply(3).subtract(1);
      }
      if (m.equals(Z17)) {
        return p;
      }
    }
  }
}

