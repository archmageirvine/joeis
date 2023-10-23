package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A066488 Composite numbers n which divide A001045(n-1).
 * @author Sean A. Irvine
 */
public class A066488 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(3) != 0) {
        final Z m = n.subtract(1);
        if (Z.TWO.modPow(m, n).equals(Z.ONE)) {
          return n;
        }
      }
    }
  }
}
