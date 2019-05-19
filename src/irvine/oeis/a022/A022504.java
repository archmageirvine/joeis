package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022504 Describe the previous <code>term!</code> (method <code>B -</code> initial term is <code>8)</code>.
 * @author Sean A. Irvine
 */
public class A022504 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.EIGHT : A022470.describe(mPrev);
    return mPrev;
  }
}
