package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003635.
 * @author Sean A. Irvine
 */
public class A003635 extends A003634 {

  @Override
  public Z next() {
    while (true) {
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
