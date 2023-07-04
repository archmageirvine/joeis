package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A025455 a(n) is the number of partitions of n into 2 positive cubes.
 * @author Sean A. Irvine
 */
public class A025455 extends MemoryFunctionInt3Sequence<Z> {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k, final int t) {
    if (n == 0) {
      return t == 0 ? Z.ONE : Z.ZERO;
    }
    if (k < 1 || t < 1) {
      return Z.ZERO;
    }
    Z res = get(n, k - 1, t);
    if (k * k * k <= n) {
      res = res.add(get(n - k * k * k, k, t - 1));
    }
    return res;
  }

  protected int numCubes() {
    return 2;
  }

  @Override
  public Z next() {
    return get(++mN, Z.valueOf(mN).root(3).intValue(), numCubes());
  }
}

