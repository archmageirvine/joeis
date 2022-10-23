package irvine.oeis.a047;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047997 Triangle of numbers a(n,k) = number of balance positions when k equal weights are placed at a k-subset of the points {-n, -(n-1), ..., n-1, n} on a centrally pivoted rod.
 *
 * @author Sean A. Irvine
 */
public class A047997 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    long cnt = 0;
    final int max = 2 * mN - mM + 1;
    final int t = mM * max / 2;
    if (t <= 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(t);
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length <= mM && p[0] <= max) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
