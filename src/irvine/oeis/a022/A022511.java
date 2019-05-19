package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022511 Describe previous term from the right (method <code>A -</code> initial term is <code>7)</code>.
 * @author Sean A. Irvine
 */
public class A022511 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.SEVEN : A022482.describe(mPrev);
    return mPrev;
  }
}
