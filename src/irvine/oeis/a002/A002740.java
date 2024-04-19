package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002740 Number of tree-rooted bridgeless planar maps with two vertices and n faces.
 * @author Sean A. Irvine
 */
public class A002740 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    return Functions.FACTORIAL.z(2 * (mN - 1))
      .divide2()
      .divide(Functions.FACTORIAL.z(mN))
      .divide(Functions.FACTORIAL.z(mN - 3));
  }
}
