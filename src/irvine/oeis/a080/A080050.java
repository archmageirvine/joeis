package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A080050 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Z.ONE.shiftLeft(p.longValueExact()).subtract(1).gcd(Functions.FIBONACCI.z(p)).isOne()) {
        return p;
      }
    }
  }
}

