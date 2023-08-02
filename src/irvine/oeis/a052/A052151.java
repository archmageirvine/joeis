package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;

/**
 * A052151 Number of self-complementary directed 3-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A052151 extends A052107 {

  @Override
  protected int edges(final int[] v) {
    int sum = 0;
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        sum += IntegerUtils.gcd(v[i], v[j]);
      }
    }
    sum *= 4;
    for (final int j : v) {
      sum += 2 * j - 1;
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(mN / 2);
    int[] p;
    while ((p = part.next()) != null) {
      final Z t = IntegerPartition.permCount(p, 2).shiftLeft(2L * edges(p));
      sum = sum.add(t.multiply((mN & 1) == 1 ? Z.valueOf(mN).shiftLeft(4L * p.length) : Z.ONE));
    }
    return sum.divide(mF.factorial(mN));
  }
}
