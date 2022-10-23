package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006470 Number of tree-rooted planar maps with 3 faces and n vertices and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006470 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 3).multiply(mN + 2).multiply(mN + 1).multiply(mN + 1).multiply(mN).divide(24);
  }
}
