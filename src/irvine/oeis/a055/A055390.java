package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a007.A007634;

/**
 * A055390 Terms of A007634 where n - 40 is not a square.
 * @author Sean A. Irvine
 */
public class A055390 extends A007634 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!mN.subtract(40).isSquare()) {
        return t;
      }
    }
  }
}
