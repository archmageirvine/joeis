package irvine.oeis.a058;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A058311 Number of nodes at n-th level in tree in which top node is 1; each node k has children labeled k, k+1, ..., (k+1)^2 at next level.
 * @author Sean A. Irvine
 */
public class A058311 extends MemoryFunctionInt2Sequence<Z> {

  // After R. J. Mathar

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k) {
    if (n == 1) {
      return Z.valueOf(k + 1).square().subtract(k - 1);
    } else {
      return Integers.SINGLETON.sum(k, (k + 1) * (k + 1), j -> get(n - 1, j));
    }
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : get(mN, 1);
  }
}
