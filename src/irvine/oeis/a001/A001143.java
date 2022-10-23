package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001143 Describe the previous term! (method A - initial term is 6).
 * @author Sean A. Irvine
 */
public class A001143 extends Sequence1 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.SIX : ZUtils.describe(mPrev);
    return mPrev;
  }
}
