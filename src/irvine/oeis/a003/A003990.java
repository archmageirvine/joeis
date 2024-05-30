package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003990 Table of lcm(x,y), read along antidiagonals.
 * @author Sean A. Irvine
 */
public class A003990 extends Sequence1 {

  private long mRow = 0;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf(Functions.LCM.l(mCol, mRow - mCol + 1));
  }
}
