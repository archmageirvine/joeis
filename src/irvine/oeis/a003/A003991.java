package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003991 Multiplication table read by antidiagonals: T(i,j) = i*j, i&gt;=1, j&gt;=1.
 * @author Sean A. Irvine
 */
public class A003991 extends Sequence1 {

  private long mRow = 0;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf(mCol).multiply(mRow - mCol + 1);
  }
}
