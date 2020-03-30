package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A020667 Least n-th power containing every digit.
 * @author Sean A. Irvine
 */
public class A020667 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(1023456789);
    }
    Z m = Z.TWO;
    Z power;
    Z n = power = m.pow(mN);
    while (ZUtils.syn(n) != 0b1111111111) {
      m = m.add(1);
    }
    return power;
  }
}
