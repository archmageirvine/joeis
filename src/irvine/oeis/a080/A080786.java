package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080786 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private int[] mRow = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mRow = new int[++mN];
      for (int k = 1; k <= mN; ++k) {
        ++mRow[Functions.GPF.i(k) - 1];
      }
      for (int k = 1; k < mN; ++k) {
        mRow[k] += mRow[k - 1];
      }
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
