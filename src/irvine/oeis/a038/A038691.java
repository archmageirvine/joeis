package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038691 Indices of primes at which the prime race 4k-1 vs. 4k+1 is tied.
 * @author Sean A. Irvine
 */
public class A038691 extends A000040 {

  private long mN = 0;
  private long mBias = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int r = super.next().and(Z.THREE).intValueExact();
      mBias += 2 - r;
      if (mBias == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
