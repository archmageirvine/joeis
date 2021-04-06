package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006421 Number of rooted planar maps with 4 vertices and n faces and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006421 extends A006398 {

  @Override
  protected boolean reject(final int e) {
    return hasIsthmus(e, mS);
  }

  @Override
  public Z next() {
    planarCount(0, ++mN + 2, 4, 4, mVerbose);
    return Z.valueOf(mTotal);
  }
}
