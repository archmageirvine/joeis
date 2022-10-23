package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022501 Describe the previous term! (method B - initial term is 5).
 * @author Sean A. Irvine
 */
public class A022501 extends Sequence1 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.FIVE : A022470.describe(mPrev);
    return mPrev;
  }
}
