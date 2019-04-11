package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003991 Multiplication table read by antidiagonals: T(i,j) = i*j, i&gt;=1, <code>j&gt;=1</code>.
 * @author Sean A. Irvine
 */
public class A003991 implements Sequence {

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
