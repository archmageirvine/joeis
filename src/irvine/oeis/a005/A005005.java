package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002004;

/**
 * A005005 Davenport-Schinzel numbers of degree n on 4 symbols.
 * @author Sean A. Irvine
 */
public class A005005 extends A002004 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 4) {
      return Z.valueOf(mN).multiply(6).subtract((mN & 1) == 0 ? 13 : 14);
    } else {
      return Z.valueOf(davenportSchinzel(mN, 4));
    }
  }
}
