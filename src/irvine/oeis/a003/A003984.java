package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003984.
 * @author Sean A. Irvine
 */
public class A003984 implements Sequence {

  private long mRow = -1;
  private long mCol = -1;

  @Override
  public Z next() {
    if (++mCol > mRow) {
      ++mRow;
      mCol = 0;
    }
    return Z.valueOf(mRow - Math.min(mCol, mRow - mCol));
  }
}
