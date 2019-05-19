package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022513.
 * @author Sean A. Irvine
 */
public class A022513 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.NINE : A022482.describe(mPrev);
    return mPrev;
  }
}
