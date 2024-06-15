package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070837 extends Sequence1 {

  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    mN += 9;
    if (mN > mLim) {
      mLim *= 10;
    }
    for (long k = 0; k < 100 * mLim; ++k) {
      if (Math.abs(k - Functions.REVERSE.l(k)) == mN) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}

