package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001140 Describe the previous term! (method A - initial term is 4).
 * @author Sean A. Irvine
 */
public class A001140 extends Sequence1 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.FOUR : ZUtils.describe(mPrev);
    return mPrev;
  }
}
