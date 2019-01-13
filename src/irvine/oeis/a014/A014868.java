package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014868.
 * @author Sean A. Irvine
 */
public class A014868 extends A014901 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
