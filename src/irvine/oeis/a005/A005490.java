package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005490 Number of partitions of [n] where the first k elements are marked (0 &lt;= k &lt;= n-1) and at least k blocks contain their own index.
 * @author Sean A. Irvine
 */
public class A005490 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer i) {
    if (i == 1) {
      return Z.valueOf(n);
    }
    return get(n - 1, i - 1).multiply(n - i).add(get(n, i - 1));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}

