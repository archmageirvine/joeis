package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001155 Describe the previous term! (method A - initial term is 0).
 * @author Sean A. Irvine
 */
public class A001155 extends Sequence1 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.ZERO : ZUtils.describe(mPrev);
    return mPrev;
  }
}
