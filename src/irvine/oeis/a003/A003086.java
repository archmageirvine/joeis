package irvine.oeis.a003;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003086 Number of self-complementary digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A003086 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  private int c(final int n, final int[] j, final boolean even) {
    int s0 = 0;
    for (int k = 1; k <= n; ++k) {
      s0 += j[k] * (k * j[k] - 1);
    }
    s0 *= 2;
    int s1 = 0;
    for (int r = 1; r <= n; ++r) {
      for (int t = r + 1; t <= n; ++t) {
        s1 += IntegerUtils.gcd(r, t) * j[r] * j[t];
      }
    }
    s1 *= 4;
    return even ? s0 + s1 : s0 + s1 + (int) (2 * IntegerUtils.sum(j));
  }

  private Z product(final int[] j) {
    Z p = Z.ONE;
    for (int k = 1; k < j.length; ++k) {
      p = p.multiply(mF.factorial(j[k]).multiply(Z.valueOf(k).pow(j[k])));
    }
    return p;
  }

  private Z v(final int n, final int[] j, final boolean even) {
    return mF.factorial(n).shiftLeft(c(n, j, even)).divide(product(j));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final boolean even = (mN & 1) == 0;
    final int d = mN / 2;
    final IntegerPartition part = new IntegerPartition(d);
    final int[] j = new int[d + 1];
    int[] p;
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      sum = sum.add(v(d, j, even));
    }
    return sum.divide(mF.factorial(d));
  }
}
