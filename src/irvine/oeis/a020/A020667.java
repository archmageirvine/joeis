package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A020667 Least n-th power containing every digit.
 * @author Sean A. Irvine
 */
public class A020667 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(1023456789);
    }
    Z m = Z.TWO;
    Z power;
    while (ZUtils.syn(power = m.pow(mN)) != 0b1111111111) {
      m = m.add(1);
    }
    return power;
  }
}
