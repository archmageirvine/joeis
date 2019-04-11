package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001141 Describe the previous term! (method A - initial term is <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A001141 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.FIVE : ZUtils.describe(mPrev);
    return mPrev;
  }
}
