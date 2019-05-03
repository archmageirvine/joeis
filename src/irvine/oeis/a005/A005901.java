package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005901 Number of points on surface of cuboctahedron (or <code>icosahedron): a(0) = 1</code>; for <code>n &gt; 0, a(n) = 10n^2 + 2</code>. Also coordination sequence for f.c.c. or <code>A_3</code> or <code>D_3</code> lattice.
 * @author Sean A. Irvine
 */
public class A005901 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(10).add(2);
  }
}
