package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A066882 Number of partitions of n into prime divisors of n.
 * @author Sean A. Irvine
 */
public class A066882 extends Sequence0 {

  private long mN = -1;

  private Z partitions(final long n, final long[] parts, final int pos) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = pos; k < parts.length && parts[k] <= n; ++k) {
      sum = sum.add(partitions(n - parts[k], parts, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    return partitions(++mN, ZUtils.toLong(Jaguar.factor(mN).toZArray()), 0);
  }
}

