package irvine.oeis.a018;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018818 Number of partitions of n into divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A018818 extends MemoryFunctionInt3<Z> implements Sequence {

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
