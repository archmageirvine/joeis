package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A059618 Number of strongly unimodal partitions of n (strongly unimodal means strictly increasing then strictly decreasing).
 * @author Sean A. Irvine
 */
public class A059618 extends MemoryFunctionInt3Sequence<Z> {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int i, final int t) {
    if (t == 0 && n > i * (i - 1) / 2) {
      return Z.ZERO;
    }
    return (n == 0
      ? Z.ONE
      : Integers.SINGLETON.sum(1, Math.min(n, i - 1), j -> get(n - j, j, 0))
    ).add(t == 1
      ? Integers.SINGLETON.sum(i + 1, n, j -> get(n - j, j, 1))
      : Z.ZERO);
  }

  @Override
  public Z next() {
    return get(++mN, 0, 1);
  }
}
