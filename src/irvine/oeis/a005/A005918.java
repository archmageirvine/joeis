package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005918 Number of points on surface of square pyramid: 3*n^2 + 2 (n&gt;0).
 * @author Sean A. Irvine
 */
public class A005918 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(3).add(2);
  }
}
