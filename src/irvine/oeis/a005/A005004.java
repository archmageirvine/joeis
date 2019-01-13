package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002004;

/**
 * A005004.
 * @author Sean A. Irvine
 */
public class A005004 extends A002004 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 3) {
      return Z.valueOf(mN).multiply(3).subtract((mN & 1) == 0 ? 4 : 5);
    } else {
      return Z.valueOf(davenportSchinzel(mN, 3));
    }
  }
}
