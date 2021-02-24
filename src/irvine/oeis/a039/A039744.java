package irvine.oeis.a039;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039744 Number of ways n(n-1) can be partitioned into the sum of 2(n-1) integers in the range 0..n.
 * @author Sean A. Irvine
 */
public class A039744 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k, final int t) {
    if (n == 0) {
      return Z.ONE;
    }
    if (t * k < n) {
      return Z.ZERO;
    }
    final Z b = get(n, k - 1, t);
    return k > n ? b : b.add(get(n - k, k, t - 1));
  }

  @Override
  public Z next() {
    return get(mN++ * mN, mN, 2 * (mN - 1));
  }
}
