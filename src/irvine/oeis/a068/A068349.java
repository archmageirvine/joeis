package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068349 Numbers n having a partition n=sum x_i for which Product n/x_i is also a way of factoring n.
 * @author Sean A. Irvine
 */
public class A068349 extends Sequence1 {

  private long mN = 0;

  protected boolean isPartitionable(final long n, final long x, final long y, final long[] terms, final int pos) {
    if (pos >= terms.length || x < 0 || y > mN) {
      return false;
    }
    if (x == 0) {
      return y == mN;
    }
    if (n % terms[pos] == 0 && isPartitionable(n, x - terms[pos], y * n / terms[pos], terms, pos)) {
      return true;
    }
    return isPartitionable(n, x, y, terms, pos + 1);
  }

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      ++mN;
      if (isPartitionable(mN, mN, 1, ZUtils.toLong(Jaguar.factor(mN).divisorsSorted()), 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}
