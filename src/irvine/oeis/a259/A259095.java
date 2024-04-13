package irvine.oeis.a259;

import irvine.math.partition.DistinctPartsPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A259095 Triangle read by rows: T(n,r) = number of arrangements of n pennies in rows, with r contiguous pennies in the bottom row, and each higher row consisting of contiguous pennies, each touching two pennies in the row below (1 &lt;= r &lt;= n).
 * @author Sean A. Irvine
 */
public class A259095 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A259095(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A259095() {
    super(1);
  }

  private int mN = 0;
  private int mR = 0;

  private boolean isMaxPart(final int[] p, final int r) {
    return p[0] == r;
  }

  protected Z a259095(final int n, final int r) {
    Z sum = Z.ZERO;
    int[] p;
    final DistinctPartsPartition partition = new DistinctPartsPartition(n);
    while ((p = partition.next()) != null) {
      if (isMaxPart(p, r)) {
        Z t = Z.ONE;
        for (int k = 1; k < p.length; ++k) {
          t = t.multiply(p[k - 1] - p[k]);
        }
        sum = sum.add(t);
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mR > mN) {
      ++mN;
      mR = 1;
    }
    return a259095(mN, mR);
  }
}
