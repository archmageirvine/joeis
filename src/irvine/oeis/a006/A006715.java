package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A006715.
 * @author Sean A. Irvine
 */
public class A006715 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.THREE : ZUtils.describe(mPrev);
    return mPrev;
  }
}
