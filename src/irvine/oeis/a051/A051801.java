package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002110;

/**
 * A051801 Product of the nonzero digits of n.
 * @author Sean A. Irvine
 */
public class A051801 extends A002110 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitNZProduct(++mN, 10));
  }
}
