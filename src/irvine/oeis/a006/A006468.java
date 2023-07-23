package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006468 Number of rooted planar maps with 4 faces and n vertices and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006468 extends A006398 {

  {
    setOffset(1);
  }

  @Override
  protected boolean reject(final int e) {
    return hasIsthmus(e, mS);
  }

  @Override
  public Z next() {
    ++mN;
    planarCount(0, mN + 1, mN - 1, mN - 1, mVerbose);
    return Z.valueOf(mTotal);
  }
}
