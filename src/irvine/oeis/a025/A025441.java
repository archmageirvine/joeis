package irvine.oeis.a025;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A025441 Number of partitions of n into 2 distinct nonzero squares.
 * @author Sean A. Irvine
 */
public class A025441 extends MemoryFunctionInt3Sequence<Z> {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k, final int t) {
    if (n == 0) {
      return t == 0 ? Z.ONE : Z.ZERO;
    }
    if (t * k * k < n) {
      return Z.ZERO;
    }
    Z res = k == 1 ? Z.ZERO : get(n, k - 1, t);
    if (k * k <= n) {
      res = res.add(get(n - k * k, k - 1, t - 1));
    }
    return res;
  }

  protected int numSquares() {
    return 2;
  }

  @Override
  public Z next() {
    return get(++mN, IntegerUtils.sqrt(mN), numSquares());
  }
}

