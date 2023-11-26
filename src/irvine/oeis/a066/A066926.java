package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066926 Numbers k having a partition k = sum x_i for which sum k/x_i is also a partition of k.
 * @author Sean A. Irvine
 */
public class A066926 extends Sequence1 {

  private long mN = 0;

  private boolean isPartitionable(final long n, final long x, final long y, final long[] terms, final int pos) {
    if (pos >= terms.length || x < 0 || y < 0) {
      return false;
    }
    if (x == 0 && y == 0) {
      return true;
    }
    if (n % terms[pos] == 0 && isPartitionable(n, x - terms[pos], y - n / terms[pos], terms, pos)) {
      return true;
    }
    return isPartitionable(n, x, y, terms, pos + 1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (isPartitionable(mN, mN, mN, ZUtils.toLong(Jaguar.factor(mN).divisorsSorted()), 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}
