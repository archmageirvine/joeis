package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A058884 Partial sums of the partition function (A000041), with the last term subtracted. Also the sum of the row of the character table for S_n corresponding to the partition n-1,1 for n&gt;1. Also the sum over all partitions lambda of n of one less than the number of 1's in lambda.
 * @author Sean A. Irvine
 */
public class A058884 extends A000041 {

  private Z mSum = Z.ZERO;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mPrev.multiply2());
    mPrev = super.next();
    mSum = mSum.subtract(mPrev);
    return mSum;
  }
}
