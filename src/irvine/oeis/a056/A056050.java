package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056050 Semimorphic numbers: n^2 mod the number of digits in n = n^3 mod the number of digits in n.
 * @author Sean A. Irvine
 */
public class A056050 implements Sequence {

  private long mMod = 10;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      if (LongUtils.modPow(mN, 3, mMod) == LongUtils.modPow(mN, 2, mMod)) {
        return Z.valueOf(mN);
      }
    }
  }
}
