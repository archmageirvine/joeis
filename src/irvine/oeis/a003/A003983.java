package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003983 Array read by antidiagonals with <code>T(n,k) = min(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A003983 implements Sequence {

  private long mRow = 0;
  private long mCol = 0;

  @Override
  public Z next() {
    if (++mCol > mRow) {
      ++mRow;
      mCol = 1;
    }
    return Z.valueOf(Math.min(mRow, Math.min(mCol, mRow - mCol + 1)));
  }
}
