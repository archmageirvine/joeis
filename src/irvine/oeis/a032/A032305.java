package irvine.oeis.a032;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032305 Number of rooted trees where any 2 subtrees extending from the same node have a different number of nodes.
 * @author Sean A. Irvine
 */
public class A032305 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    if (m >= 1) {
      for (int j = 0; j <= Math.min(1, n / m); ++j) {
        sum = sum.add(get(n - m * j, m - 1).multiply(j == 0 ? Z.ONE : get(m - 1, m -1)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
