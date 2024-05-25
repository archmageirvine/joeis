package irvine.oeis.a000;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000569 Number of graphical partitions of 2n.
 * @author Sean A. Irvine
 */
public class A000569 extends Sequence1 {

  // Using recurrence derived by Barnes and Savage

  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int k, final int l, final int s) {
      if (n < 0 || k < 0 || l < 0 || s < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (k == 0 || l == 0) {
        return Z.ZERO;
      }
      if (k > n) {
        return get(n, n, l, s);
      }
      if (l > n) {
        return get(n, k, n, s);
      }
      if (s > n) {
        return get(n, k, l, n);
      }
      return get(n, k - 1, l, s)
        .add(get(n, k, l - 1, s))
        .subtract(get(n, k - 1, l - 1, s))
        .add(get(n - k - l + 1, k - 1, l - 1, s + l - k - 1));
    }
  };

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return mB.get(mN, mN, mN, 0);
  }
}
