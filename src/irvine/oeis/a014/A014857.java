package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014857.
 * @author Sean A. Irvine
 */
public class A014857 extends A014832 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
