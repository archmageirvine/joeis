package irvine.oeis.a007;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a004.A004251;

/**
 * A007722 Number of graphical partitions of biconnected graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007722 extends A004251 {

  {
    setOffset(3);
  }

  // Based on the Kai Wang paper

  {
    super.next();
  }

  private int mN = 2;

  private Z s(final int n) {
    Z sum = Z.ZERO;
    for (int k = 2 * n - 2; k <= n * (n - 2); k += 2) {
      sum = sum.add(mB.get(k - 2 * n + 3, n - 3, n - 1, 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    final Z d0 = super.next(); // D_0(n-2)
    final Z c = d0.add(s(mN));
    final Z d2 = d(mN).subtract(c);
    Z sum = Z.ZERO;
    for (int i = 4; i < mN; ++i) {
      final int k = (i + 1) / 2;
      for (int j = i & 1; j <= 2 * k - 4; j += 2) {
        sum = sum.add(IntegerPartition.partitions(j));
      }
    }
    return d2.subtract(sum);
  }
}
