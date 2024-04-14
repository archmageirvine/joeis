package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001154 Describe the previous term! (method A - initial term is 9).
 * @author Sean A. Irvine
 */
public class A001154 extends Sequence1 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.NINE : Functions.LOOK_AND_SAY.z(mPrev);
    return mPrev;
  }
}
