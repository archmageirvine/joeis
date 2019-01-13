package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004198.
 * @author Sean A. Irvine
 */
public class A004198 implements Sequence {

  private long mRow = -1;
  private long mCol = -1;

  @Override
  public Z next() {
    if (--mCol < 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf((mRow - mCol) & mCol);
  }
}
