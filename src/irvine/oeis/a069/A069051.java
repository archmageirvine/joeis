package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069044.
 * @author Sean A. Irvine
 */
public class A069051 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z m = p.subtract(1);
      if (Z.TWO.modPow(p, m).subtract(2).mod(m).isZero()) {
        return p;
      }
    }
  }
}

