package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006420 Number of rooted isthmusless planar maps with 3 vertices and n faces.
 * @author Sean A. Irvine
 */
public class A006420 extends A006398 {

  @Override
  protected boolean reject(final int e) {
    return hasIsthmus(e, mS);
  }

  @Override
  public Z next() {
    planarCount(0, ++mN + 1, 3, 3, mVerbose);
    return Z.valueOf(mTotal);
  }
}
