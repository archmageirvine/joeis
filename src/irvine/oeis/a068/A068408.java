package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068408 Automorphic numbers: numbers k such that k^6 ends with k. Also m-morphic numbers for all m not congruent to 26 (mod 50) but congruent to 6 (mod 10).
 * @author Sean A. Irvine
 */
public class A068408 extends Sequence1 {

  private long mN = -1;
  private long mLim = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10;
      }
      if (LongUtils.modPow(mN, 6, mLim) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

