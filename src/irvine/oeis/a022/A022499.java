package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022499 Describe the previous term! (method B - initial term is 3).
 * @author Sean A. Irvine
 */
public class A022499 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.THREE : A022470.describe(mPrev);
    return mPrev;
  }
}
