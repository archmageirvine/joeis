package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005903 Number of points on surface of dodecahedron: 30n^2 + 2 for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A005903 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(30).add(2);
  }
}
