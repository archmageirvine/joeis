package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022507 Describe previous term from the right (method A - initial term is 3).
 * @author Sean A. Irvine
 */
public class A022507 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.THREE : A022482.describe(mPrev);
    return mPrev;
  }
}
