package irvine.oeis.a053;

import irvine.math.IntegerUtils;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a052.A052107;

/**
 * A053588 Number of self-complementary 4-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A053588 extends A052107 {

  // After Andrew Howroyd

  private int mN = 0;

  @Override
  protected int edges(final int[] v) {
    int sum = 0;
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        if (((v[i] * v[j]) & 1) == 0) {
          sum += IntegerUtils.gcd(v[i], v[j]);
        }
      }
    }
    for (final int j : v) {
      if ((j & 1) == 0) {
        sum += (j / 4) * 2;
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    while ((p = part.next()) != null) {
      sum = sum.add(IntegerPartition.permCount(p, 1).multiply(Z.FIVE.pow(edges(p))));
    }
    return sum.divide(mF.factorial(mN));
  }
}
