package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006715 Describe the previous term! (method A - initial term is 3).
 * @author Sean A. Irvine
 */
public class A006715 extends Sequence1 {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.THREE : Functions.LOOK_AND_SAY.z(mPrev);
    return mPrev;
  }
}
