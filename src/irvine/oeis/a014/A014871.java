package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014871.
 * @author Sean A. Irvine
 */
public class A014871 extends A014904 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
