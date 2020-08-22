package irvine.oeis.a025;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025468 a(n) is the number of partitions of n into 2 distinct positive cubes.
 * @author Sean A. Irvine
 */
public class A025468 extends MemoryFunctionInt3<Z> implements Sequence {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k, final int t) {
    if (n == 0) {
      return t == 0 ? Z.ONE : Z.ZERO;
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
    return get(++mN, IntegerUtils.sqrt(mN), numCubes());
  }
}

