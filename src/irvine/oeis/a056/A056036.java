package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056036 5-morphic but not bimorphic, automorphic nor trimorphic.
 * @author Sean A. Irvine
 */
public class A056036 extends Sequence1 {

  private long mMod = 10;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      if (LongUtils.modPow(mN, 5, mMod) == mN && LongUtils.modPow(mN, 3, mMod) != mN && LongUtils.modPow(mN, 2, mMod) != mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
