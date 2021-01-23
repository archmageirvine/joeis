package irvine.oeis.a034;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008578;

/**
 * A034891 Number of different products of partitions of n; number of partitions of n into prime parts (1 included); number of distinct orders of Abelian subgroups of symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A034891 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private final MemorySequence mPi = MemorySequence.cachedSequence(new A008578());
  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 0) {
      return Z.ZERO;
    }
    final int p = mPi.a(m).intValueExact();
    if (p > n) {
      return get(n, m - 1);
    } else {
      return get(n, m - 1).add(get(n - p, m));
    }
  }

  @Override
  public Z next() {
    return get(++mN, mPi.a(mN).intValueExact());
  }
}
