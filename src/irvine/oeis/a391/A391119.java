package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391119 allocated for Michael Shanahan.
 * @author Sean A. Irvine
 */
public class A391119 extends Sequence0 {

  private Z mSum = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(++mN);
    if (mN >= 2) {
      mSum = mSum.add(Functions.PREV_PRIME.l(mN + 1));
    }
    return mSum;
  }
}
