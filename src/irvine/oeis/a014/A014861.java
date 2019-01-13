package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014861.
 * @author Sean A. Irvine
 */
public class A014861 extends A014896 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
