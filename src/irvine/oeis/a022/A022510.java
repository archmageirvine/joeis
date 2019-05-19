package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022510 Describe previous term from the right (method <code>A -</code> initial term is <code>6)</code>.
 * @author Sean A. Irvine
 */
public class A022510 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.SIX : A022482.describe(mPrev);
    return mPrev;
  }
}
