package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A025435 Number of partitions of n into 2 distinct squares.
 * @author Sean A. Irvine
 */
public class A025435 extends MemoryFunctionInt3Sequence<Z> {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k, final int t) {
    if (n == 0) {
      return Z.ONE;
    }
    if (t * k * k < n) {
      return Z.ZERO;
    }
    Z res = get(n, k - 1, t);
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
    if (++mN == 0) {
      return Z.ZERO;
    }
    return get(mN, Functions.SQRT.i(mN), numSquares());
  }
}

