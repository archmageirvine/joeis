package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005919 Number of points on surface of tricapped prism: 7n^2 + 2 for n &gt; 0, a(0)=1.
 * @author Sean A. Irvine
 */
public class A005919 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(7).add(2);
  }
}
