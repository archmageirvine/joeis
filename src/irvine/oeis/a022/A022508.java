package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022508 Describe previous term from the right (method <code>A -</code> initial term is <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A022508 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.FOUR : A022482.describe(mPrev);
    return mPrev;
  }
}
