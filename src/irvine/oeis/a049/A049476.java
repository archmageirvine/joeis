package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a088.A088643;

/**
 * A049476 Numbers that set records for initial gap lengths g in the permutations found in A088643.
 * @author Sean A. Irvine
 */
public class A049476 extends A088643 {

  // todo what is this sequence?

  private long mN = 0;
  private long mMaxGap = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long gap = 0;
      long s = super.next().longValueExact();
      for (int k = 1; k < mN; ++k) {
        final long t = s;
        s = super.next().longValueExact();
        final long g = t - s; //s - t; //Math.abs(s - t);
        if (g > gap) {
          gap = g;
        }
      }
      if (gap > mMaxGap) {
        mMaxGap = gap;
        System.out.println("gap was " + mMaxGap);
        return Z.valueOf(mN);
      }
    }
  }
}
