package irvine.oeis.a171;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A171967 Number of partitions of n with distinct numbers of odd and even parts.
 * @author Sean A. Irvine
 */
public class A171967 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int i, final int t) {
    if (n == 0) {
      return t != 0 ? Z.ONE : Z.ZERO;
    }
    if (i < 1) {
      return Z.ZERO;
    }
    final Z s = get(n, i - 1, t);
    return i > n ? s : s.add(get(n - i, i, t + 2 * (i & 1) - 1));
  }

  @Override
  public Z next() {
    return get(++mN, mN, 0);
  }
}
