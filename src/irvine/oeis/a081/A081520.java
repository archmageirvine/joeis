package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081520 Triangle read by rows in which row n consists of 1 and the n-1 smallest positive numbers having common factors with n.
 * @author Sean A. Irvine
 */
public class A081520 extends Sequence1 {

  protected long[] mRow = {};
  private int mN = 0;
  private int mM = 0;

  protected void step() {
    mRow = new long[++mN];
    mRow[0] = 1;
    long j = 1;
    for (int k = 1; k < mRow.length; ++k) {
      while (Functions.GCD.l(++j, mN) == 1) {
        // do nothing
      }
      mRow[k] = j;
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      step();
    }
    return Z.valueOf(mRow[mM]);
  }
}
