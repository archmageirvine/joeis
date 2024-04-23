package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A034891 Number of different products of partitions of n; number of partitions of n into prime parts (1 included); number of distinct orders of Abelian subgroups of symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A034891 extends MemoryFunction2Sequence<Integer, Z> {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 0) {
      return Z.ZERO;
    }
    final int p = (int) Functions.PRIME.l(m);
    if (p > n) {
      return get(n, m - 1);
    } else {
      return get(n, m - 1).add(get(n - p, m));
    }
  }

  @Override
  public Z next() {
    return get(++mN, (int) Functions.PRIME.l(mN));
  }
}
