package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005893 Number of points on surface of tetrahedron; coordination sequence for sodalite net (equals 2*n^2+2 for n &gt; 0).
 * @author Sean A. Irvine
 */
public class A005893 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply2().add(mN.isZero() ? 1 : 2);
  }
}
