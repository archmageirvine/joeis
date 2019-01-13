package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000340;

/**
 * A014850.
 * @author Sean A. Irvine
 */
public class A014850 extends A000340 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
