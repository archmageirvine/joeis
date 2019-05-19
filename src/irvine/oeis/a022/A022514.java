package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022514.
 * @author Sean A. Irvine
 */
public class A022514 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.THREE : A022488.describe(mPrev);
    return mPrev;
  }
}
