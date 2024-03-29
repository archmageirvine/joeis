package irvine.oeis.a067;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067136 Number of Young tableaux with n cells whose shape is symmetric.
 * @author Sean A. Irvine
 */
public class A067136 extends Sequence0 {

  private int mN = -1;

  private int gt(final int[] p, final int k, final int m) {
    int cnt = 0;
    for (int j = k; j < p.length; ++j) {
      if (p[j] > m) {
        ++cnt;
      }
    }
    return cnt;
  }

  private Z hook(final int n, final int[] p) {
    Z prod = Z.ONE;
    for (int k = 0; k < p.length; ++k) {
      for (int j = 0; j < p[k]; ++j) {
        prod = prod.multiply(gt(p, k, j) + p[k] - j - 1);
      }
    }
    return MemoryFactorial.SINGLETON.factorial(n).divide(prod);
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      if (Arrays.equals(p, IntegerPartition.dual(p))) {
        sum = sum.add(hook(mN, p));
      }
    }
    return sum;
  }
}

