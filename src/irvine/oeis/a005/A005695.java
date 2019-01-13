package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005695.
 * @author Sean A. Irvine
 */
public class A005695 extends A005694 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (remoteness(++mN) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
