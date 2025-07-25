package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078733 Numbers k such that the b0(k)^2=b1(k) where b1(k) denotes the number of 1's in binary expansion of k, b0(k) the number of 0's.
 * @author Sean A. Irvine
 */
public class A078733 extends Sequence1 {

  private long mN = 1;
  private long mLim = 2;
  private long mL = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 2;
        ++mL;
      }
      final long c = Long.bitCount(mN);
      if (c == (mL - c) * (mL - c)) {
        return Z.valueOf(mN);
      }
    }
  }
}
