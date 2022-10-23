package irvine.oeis.a059;

import irvine.math.IntegerUtils;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A059982 Symmetric array of numeric partitions related to 1 4 9 16 ... and 1 3 4 7 13 ..., read by rows.
 * @author Sean A. Irvine
 */
public class A059982 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final DynamicIntArray mColIndex = new DynamicIntArray();

  @Override
  public Z next() {
    if (++mM * mM > mN) {
      ++mN;
      mM = -IntegerUtils.sqrt(mN);
    }
    if (mM <= 0) {
      mColIndex.set(-mM, mColIndex.get(-mM) + 1);
    }
    return IntegerPartition.partitions(mColIndex.get(Math.abs(mM)) - 1);
  }
}
