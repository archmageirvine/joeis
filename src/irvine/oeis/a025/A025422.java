package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A025422 Number of partitions of n into 7 squares.
 * @author Sean A. Irvine
 */
public class A025422 extends MemoryFunctionInt3Sequence<Z> {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k, final int t) {
    if (n == 0) {
      return Z.ONE;
    }
    if (k < 1 || t < 1) {
      return Z.ZERO;
    }
    Z res = get(n, k - 1, t);
    if (k * k <= n) {
      res = res.add(get(n - k * k, k, t - 1));
    }
    return res;
  }

  protected int numSquares() {
    return 7;
  }

  @Override
  public Z next() {
    return get(++mN, Functions.SQRT.i(mN), numSquares());
  }
}

