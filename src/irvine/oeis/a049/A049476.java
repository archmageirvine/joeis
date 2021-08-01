package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a088.A088643;

/**
 * A049476 Numbers that set records for initial gap lengths g in the permutations found in A088643.
 * @author Sean A. Irvine
 */
public class A049476 extends A088643 {

  private long mN = 0;
  private long mGap = -1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final long gap = mN - mPrime.prevPrime(mN) - 1;
      if (gap > mGap) {
        mGap = gap;
        return Z.valueOf(mN);
      }
    }
  }
}
