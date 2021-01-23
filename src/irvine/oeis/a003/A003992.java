package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003992 Square array read by upwards antidiagonals: T(n,k) = n^k for n &gt;= 0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A003992 implements Sequence {

  private int mRow = -1;
  private int mCol = -1;

  @Override
  public Z next() {
    if (--mCol < 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf(mCol).pow(mRow - mCol);
  }
}
