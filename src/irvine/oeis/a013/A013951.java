package irvine.oeis.a013;

import irvine.math.z.Z;

/**
 * A013951.
 * @author Sean A. Irvine
 */
public class A013951 extends A013949 {

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
