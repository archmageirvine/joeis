package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068407 Automorphic numbers: numbers k such that k^5 ends with k. Also m-morphic numbers for all m &gt; 5 such that m-1 is not divisible by 10 and m == 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A068407 extends Sequence1 {

  private long mN = -1;
  private long mLim = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10;
      }
      if (LongUtils.modPow(mN, 5, mLim) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

