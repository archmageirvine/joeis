package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022512.
 * @author Sean A. Irvine
 */
public class A022512 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.EIGHT : A022482.describe(mPrev);
    return mPrev;
  }
}
