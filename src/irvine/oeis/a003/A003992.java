package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003992.
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
