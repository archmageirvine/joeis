package irvine.oeis.a061;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partition.DistinctPartsPartition;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061343 Number of standard shifted tableaux with n entries.
 * @author Sean A. Irvine
 */
public class A061343 extends Sequence1 {

  // After Joerg Arndt

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = 0;

  private Z productFactorials(final int[] v) {
    return Integers.SINGLETON.product(0, v.length - 1, k -> F.factorial(v[k]));
  }

  // Return product of differences of distinct pairs
  private Z dm(final int[] v) {
    Z p = Z.ONE;
    for (int j = 0; j < v.length; ++j) {
      for (int i = j + 1; i < v.length; ++i) {
        p = p.multiply(v[j] - v[i]);
      }
    }
    return p;
  }

  // Return product of sums of distinct pairs
  private Z dp(final int[] v) {
    Z p = Z.ONE;
    for (int j = 0; j < v.length; ++j) {
      for (int i = j + 1; i < v.length; ++i) {
        p = p.multiply(v[i] + v[j]);
      }
    }
    return p;
  }

  // Thrall's formula (4) at page 83:
  private Z ntab(final int[] v) {
    return dm(v).multiply(F.factorial(mN)).divide(productFactorials(v).multiply(dp(v)));
  }

  @Override
  public Z next() {
    final DistinctPartsPartition part = new DistinctPartsPartition(++mN);
    int[] p;
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      sum = sum.add(ntab(p));
    }
    return sum;
  }
}
