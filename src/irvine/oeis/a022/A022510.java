package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022510 Describe previous term from the right (method A - initial term is 6).
 * @author Sean A. Irvine
 */
public class A022510 extends Sequence0 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.SIX : A022482.describe(mPrev);
    return mPrev;
  }
}
