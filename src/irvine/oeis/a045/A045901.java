package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045901 Group the natural numbers into blocks: B_1 = 1, B_2 = 2,3,4, B_3 = 5,6,7,8,9, ..., each block ending in a square. Permute each block B_k by beginning with the central term, followed by the transposed symmetric pairs from B_k.
 * @author Sean A. Irvine
 */
public class A045901 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mS = 0;

  @Override
  public Z next() {
    if (++mM >= 2 * mN) {
      ++mN;
      mM = 1;
      mS = mN * mN - mN + 1;
    }
    return Z.valueOf((mM & 1) == 0 ? mS + mM / 2 : mS - mM / 2);
  }
}
