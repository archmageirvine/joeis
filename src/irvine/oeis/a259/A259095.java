package irvine.oeis.a259;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A259095 Triangle read by rows: <code>T(n</code>,r) = number of arrangements of n pennies in rows, with r contiguous pennies in the bottom row, and each higher row consisting of contiguous pennies, each touching two pennies in the row below <code>(1 &lt;=</code> r <code>&lt;= n)</code>.
 * @author Sean A. Irvine
 */
public class A259095 implements Sequence {

  private int mN = 0;
  private int mR = 0;

  private boolean isDistinctParts(final int[] p) {
    for (int k = p.length - 1; k > 0; --k) {
      if (p[k - 1] == p[k]) {
        return false;
      }
    }
    return true;
  }

  private boolean isMaxPart(final int[] p, final int r) {
    return p[0] == r;
  }

  protected Z a259095(final int n, final int r) {
    Z sum = Z.ZERO;
    int[] p;
    final IntegerPartition partition = new IntegerPartition(n);
    while ((p = partition.next()) != null) {
      if (isMaxPart(p, r) && isDistinctParts(p)) {
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
