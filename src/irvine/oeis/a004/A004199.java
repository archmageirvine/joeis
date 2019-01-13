package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004199.
 * @author Sean A. Irvine
 */
public class A004199 implements Sequence {

  private long mRow = 1;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      mCol = mRow;
      ++mRow;
    }
    return Z.valueOf((mRow - mCol) / mCol);
  }
}
