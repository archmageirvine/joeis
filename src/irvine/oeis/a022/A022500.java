package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022500 Describe the previous term! (method B - initial term is 4).
 * @author Sean A. Irvine
 */
public class A022500 extends Sequence1 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.FOUR : A022470.describe(mPrev);
    return mPrev;
  }
}
