package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005918 Number of points on surface of square pyramid: 3*n^2 + 2 (n&gt;0).
 * @author Sean A. Irvine
 */
public class A005918 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(3).add(2);
  }
}
