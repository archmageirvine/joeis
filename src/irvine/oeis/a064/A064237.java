package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064237 Numbers k such that k! + 1 is divisible by a square.
 * @author Sean A. Irvine
 */
public class A064237 extends A000142 {

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(super.next().add(1)).maxExponent() > 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
