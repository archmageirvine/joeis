package irvine.oeis.a035;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035098 Near-Bell numbers: partitions of an n-multiset with multiplicities 1, 1, 1, ..., 1, 2.
 * @author Sean A. Irvine
 */
public class A035098 extends Sequence1 {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN, k).multiply((k + 1) * (k + 2) / 2 + 1));
    }
    return sum;
  }
}
