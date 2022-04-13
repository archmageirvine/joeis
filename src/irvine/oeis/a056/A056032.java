package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056032 Trimorphic but not bimorphic nor automorphic.
 * @author Sean A. Irvine
 */
public class A056032 implements Sequence {

  private long mMod = 10;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      if (LongUtils.modPow(mN, 3, mMod) == mN && LongUtils.modPow(mN, 2, mMod) != mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
