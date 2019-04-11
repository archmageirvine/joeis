package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001143 Describe the previous term! (method A - initial term is <code>6)</code>.
 * @author Sean A. Irvine
 */
public class A001143 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.SIX : ZUtils.describe(mPrev);
    return mPrev;
  }
}
