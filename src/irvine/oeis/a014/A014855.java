package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014855.
 * @author Sean A. Irvine
 */
public class A014855 extends A014831 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
