package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006468.
 * @author Sean A. Irvine
 */
public class A006468 extends A006398 {

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
