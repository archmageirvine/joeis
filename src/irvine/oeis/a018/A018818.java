package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A018818 Number of partitions of n into divisors of n.
 * @author Sean A. Irvine
 */
public class A018818 extends MemoryFunctionInt3Sequence<Z> {

  private int mN = 0;

  @Override
  protected Z compute(final int n, final int m, final int k) {
    if (k > m) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n, m, k + 1).add(n % k == 0 ? get(n, m - k, k) : Z.ZERO);
  }

  @Override
  public Z next() {
    return get(++mN, mN, 1);
  }
}
