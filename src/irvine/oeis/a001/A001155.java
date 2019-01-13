package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001155.
 * @author Sean A. Irvine
 */
public class A001155 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.ZERO : ZUtils.describe(mPrev);
    return mPrev;
  }
}
