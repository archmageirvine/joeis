package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006411 Number of nonseparable tree-rooted planar maps with n + 2 edges and 3 vertices.
 * @author Sean A. Irvine
 */
public class A006411 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 2).multiply(mN + 3).divide(24);
  }
}
