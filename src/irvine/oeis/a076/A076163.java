package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A076163 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(Functions.DIGIT_SUM_SQUARES.z(p)).abs().isProbablePrime()) {
        return p;
      }
    }
  }
}
