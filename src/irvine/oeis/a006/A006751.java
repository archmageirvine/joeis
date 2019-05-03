package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A006751 Describe the previous <code>term! (method A -</code> initial term is <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A006751 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.TWO : ZUtils.describe(mPrev);
    return mPrev;
  }
}
