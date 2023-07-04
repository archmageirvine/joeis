package irvine.oeis.a060;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Z;

/**
 * A060005 Number of ways of partitioning the integers {1,2,..,4n} into two (unordered) sets such that the sums of parts are equal in both sets (parts in either set will add up to (4n)*(4n+1)/4). Number of solutions to {1 +- 2 +- 3 +- ... +- 4n=0}.
 * @author Sean A. Irvine
 */
public class A060005 extends MemoryFunctionInt2Sequence<Z> {

  // After Alois P. Heinz

  private int mN = -4;

  @Override
  protected Z compute(final int n, final int i) {
    final int m = i * (i + 1) / 2;
    if (n > m) {
      return Z.ZERO;
    }
    if (n == m) {
      return Z.ONE;
    }
    return get(Math.abs(n - i), i - 1).add(get(n + i, i - 1));
  }

  @Override
  public Z next() {
    mN += 4;
    return get(mN, mN - 1);
  }
}
