package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005905 Number of points on surface of truncated tetrahedron: 14n^2 + 2 for n&gt;0, a(0)=1.
 * @author Sean A. Irvine
 */
public class A005905 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(14).add(2);
  }
}
