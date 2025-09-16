package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A387775.
 * @author Sean A. Irvine
 */
public class A080363 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z gpf = Functions.GPF.z(c);
      if (Functions.GCD.z(gpf, c.divide(gpf)).isOne()) {
        return c;
      }
    }
  }
}
