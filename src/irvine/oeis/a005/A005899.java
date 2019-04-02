package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005899 Number of points on surface of octahedron; also coordination sequence for cubic lattice: a(0) = 1; for n &gt; 0, a(n) = 4n^2 + 2,.
 * @author Sean A. Irvine
 */
public class A005899 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(4).add(2);
  }
}
