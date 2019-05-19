package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022515 Describe previous term from the right (method <code>B -</code> initial term is <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A022515 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.FOUR : A022488.describe(mPrev);
    return mPrev;
  }
}
