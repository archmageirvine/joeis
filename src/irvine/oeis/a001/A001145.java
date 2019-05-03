package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001145 Describe the previous <code>term! (method A -</code> initial term is <code>7)</code>.
 * @author Sean A. Irvine
 */
public class A001145 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.SEVEN : ZUtils.describe(mPrev);
    return mPrev;
  }
}
