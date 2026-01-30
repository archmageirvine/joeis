package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392835 allocated for Pang Ern.
 * @author Sean A. Irvine
 */
public class A392835 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k < mN; ++k) {
      if (Functions.GCD.l(mN + k, mN * k) == Functions.GCD.l(k, mN)) {
        mCount += 2;
      }
    }
    if (Functions.GCD.l(2 * mN, mN * mN) == mN) {
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
