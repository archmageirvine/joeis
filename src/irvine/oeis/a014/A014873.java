package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014873.
 * @author Sean A. Irvine
 */
public class A014873 extends A014907 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
