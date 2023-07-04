package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A025464 Number of partitions of n into 2 distinct nonnegative cubes.
 * @author Sean A. Irvine
 */
public class A025464 extends MemoryFunctionInt3Sequence<Z> {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k, final int t) {
    if (n == 0) {
      return Z.ONE;
    }
    if (t * k * k * k < n) {
      return Z.ZERO;
    }
    Z res = k == 1 ? Z.ZERO : get(n, k - 1, t);
    if (k * k * k <= n) {
      res = res.add(get(n - k * k * k, k - 1, t - 1));
    }
    return res;
  }

  protected int numCubes() {
    return 2;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return get(mN, Z.valueOf(mN).root(3).intValue(), numCubes());
  }
}

