package irvine.oeis.a003;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003990 Table of lcm(x,y), read along antidiagonals.
 * @author Sean A. Irvine
 */
public class A003990 implements Sequence {

  private long mRow = 0;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf(LongUtils.lcm(mCol, mRow - mCol + 1));
  }
}
