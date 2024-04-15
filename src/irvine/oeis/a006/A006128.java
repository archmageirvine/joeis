package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006128 Total number of parts in all partitions of n. Also, sum of largest parts of all partitions of n.
 * @author Sean A. Irvine
 */
public class A006128 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006128(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006128() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(IntegerPartition.partitions(mN - k).multiply(Functions.SIGMA0.z(k)));
    }
    return sum;
  }
}
