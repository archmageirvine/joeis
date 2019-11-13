package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a047.A047749;

/**
 * A027610.
 * @author Sean A. Irvine
 */
public class A027610 extends A047749 {

  private long mN = 0;

  @Override
  public Z next() {
    Z res = a1764(++mN).multiply2().divide(mN + 1).add(a47749(mN).multiply(9));
    if ((mN & 1) == 0) {
      res = res.add(a1764(mN / 2).multiply(5));
    }
    if ((mN - 1) % 3 == 0) {
      res = res.add(a1764((mN - 1) / 3).multiply(8));
    }
    if ((mN - 1) % 4 == 0) {
      res = res.add(a1764((mN - 1) / 4).multiply(6));
    }
    if ((mN - 2) % 6 == 0) {
      res = res.add(a1764((mN - 2) / 6).multiply(4));
    }
    if ((2 * mN - 1) % 3 == 0) {
      res = res.add(a47749((2 * mN - 1) / 3).multiply(4));
    }
    return res.divide(24);
  }
}
