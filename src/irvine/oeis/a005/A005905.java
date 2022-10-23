package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005905 Number of points on surface of truncated tetrahedron: 14n^2 + 2 for n&gt;0, a(0)=1.
 * @author Sean A. Irvine
 */
public class A005905 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(14).add(2);
  }
}
