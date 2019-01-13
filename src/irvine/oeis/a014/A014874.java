package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014874.
 * @author Sean A. Irvine
 */
public class A014874 extends A014909 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
