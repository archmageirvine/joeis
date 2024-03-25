package irvine.oeis.a068;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.a061.A061897;

/**
 * A068913 Square array read by antidiagonals of number of k step walks (each step +-1 starting from 0) which are never more than n or less than -n.
 * @author Sean A. Irvine
 */
public class A068913 extends A061897 {

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n >= m) {
        return Z.ONE.shiftLeft(m);
      }
      final Z u = get(n, m - 1).multiply2();
      if (m - n <= 0 || ((m - n) & 1) == 0) {
        return u;
      } else {
        return u.subtract(A068913.super.t(n + 1, (m - n - 1) / 2));
      }
    }
  };

  @Override
  protected Z t(final int n, final int m) {
    return mB.get(n, m);
  }
}

