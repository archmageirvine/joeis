package irvine.oeis.a346;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A346081 Number of nonsingular binary matrices by dimension and number of primary rational canonical blocks.
 * @author Gregory Morse
 */
public class A346081 extends Sequence0 {

  private int mN = -1;
  private int mK = 0;
  private Z[] mRow = {};

  @Override
  public Z next() {
    if (mK == mRow.length) {
      mRow = BinaryLinearMatrixCounts.primaryBlockCounts(++mN);
      mK = 0;
    }
    return mRow[mK++];
  }
}
