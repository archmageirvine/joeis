package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033819 Trimorphic numbers: n^3 ends with n. Also m-morphic numbers for all m &gt; 5 such that m-1 is not divisible by 10 and m == 3 (mod 4).
 * @author Sean A. Irvine
 */
public class A033819 implements Sequence {

  private long mMod = 10;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      if (Z.valueOf(mN).pow(3).mod(mMod) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
