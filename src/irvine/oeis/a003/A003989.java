package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003989 Triangle T from the array A(x, y) = gcd(x,y), for x &gt;= 1, y &gt;= 1, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A003989 extends Sequence1 {

  private long mRow = 0;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      ++mRow;
      mCol = mRow;
    }
    return Functions.GCD.z(mCol, mRow - mCol + 1);
  }
}
