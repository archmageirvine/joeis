package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014865.
 * @author Sean A. Irvine
 */
public class A014865 extends A014898 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
