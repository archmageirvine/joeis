package irvine.oeis.a003;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003989 Triangle T from the array A(x, y) = gcd(x,y), for <code>x &gt;= 1,</code> y <code>&gt;= 1,</code> read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A003989 implements Sequence {

  private long mRow = 0;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf(LongUtils.gcd(mCol, mRow - mCol + 1));
  }
}
