package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003987 Table of n XOR m (or Nim-sum of n and m) read by antidiagonals with m&gt;=0, n&gt;=0.
 * @author Sean A. Irvine
 */
public class A003987 extends Sequence0 {

  private long mRow = -1;
  private long mCol = -1;

  @Override
  public Z next() {
    if (--mCol < 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf((mRow - mCol) ^ mCol);
  }
}
