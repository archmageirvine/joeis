package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001154 Describe the previous <code>term!</code> (method <code>A -</code> initial term is <code>9)</code>.
 * @author Sean A. Irvine
 */
public class A001154 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.NINE : ZUtils.describe(mPrev);
    return mPrev;
  }
}
