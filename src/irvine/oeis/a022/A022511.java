package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022511 Describe previous term from the right (method A - initial term is 7).
 * @author Sean A. Irvine
 */
public class A022511 extends Sequence0 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.SEVEN : A022482.describe(mPrev);
    return mPrev;
  }
}
