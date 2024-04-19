package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001005 Number of ways of partitioning n points on a circle into subsets only of sizes 2 and 3.
 * @author Sean A. Irvine
 */
public class A001005 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z nf = Functions.FACTORIAL.z(mN);
    for (int j = 0; j <= mN / 3; ++j) {
      final int twoK = mN - 3 * j;
      if ((twoK & 1) == 0) {
        final int k = twoK / 2;
        sum = sum.add(nf.divide(Functions.FACTORIAL.z(j)).divide(Functions.FACTORIAL.z(k)).divide(Functions.FACTORIAL.z(mN - k - j + 1)));
      }
    }
    return sum;
  }
}
