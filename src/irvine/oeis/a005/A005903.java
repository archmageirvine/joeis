package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005903 Number of points on surface of dodecahedron: <code>30n^2 + 2</code> for <code>n &gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A005903 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(30).add(2);
  }
}
