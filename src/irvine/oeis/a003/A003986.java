package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003986 Table T(n,k) = n OR k read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A003986 extends Sequence0 {

  private long mRow = -1;
  private long mCol = -1;

  @Override
  public Z next() {
    if (--mCol < 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf((mRow - mCol) | mCol);
  }
}
