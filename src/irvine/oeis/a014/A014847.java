package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A014847.
 * @author Sean A. Irvine
 */
public class A014847 extends A000108 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
