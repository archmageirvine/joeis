package irvine.oeis.a081;

import irvine.math.group.DihedralGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081721 Number of bracelets of n beads in up to n colors.
 * @author Sean A. Irvine
 */
public class A081721 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN == 2) {
      return Z.THREE;
    }
    return new DihedralGroup(mN).cycleIndex().eval(mN).toZ();
  }
}
