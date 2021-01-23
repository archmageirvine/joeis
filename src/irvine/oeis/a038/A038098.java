package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A038098 Number of primes &lt; n^3.
 * @author Sean A. Irvine
 */
public class A038098 extends A000720 {

  private long mN = 0;
  private long mLim = 1;
  private long mCubeM1 = 0;

  @Override
  public Z next() {
    while (mN < mCubeM1) {
      ++mN;
      super.next();
    }
    ++mN;
    mCubeM1 = ++mLim * mLim * mLim - 1;
    return super.next();
  }
}
