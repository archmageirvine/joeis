package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014862.
 * @author Sean A. Irvine
 */
public class A014862 extends A014897 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
