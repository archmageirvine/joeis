package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071202 Array read by antidiagonals giving number of paths up and left from (0,0) to (n,k) where x/y&lt;n/k (except at start and finish).
 * @author Sean A. Irvine
 */
public class A071202 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z a(final int n, final int k) {
    final MemoryFunctionInt2<Z> b = new MemoryFunctionInt2<Z>() {
      @Override
      protected Z compute(final int x, final int y) {
        if (x < 0 || y < 0) {
          return Z.ZERO;
        }
        if (x == 0 && y == 0) {
          return Z.ONE;
        }
        if (x == n && y == k) {
          return get(x - 1, y);
        }
        if (k * x >= n * y) {
          return Z.ZERO;
        }
        return get(x - 1, y).add(get(x, y - 1));
      }
    };
    return b.get(n, k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a(mM, 1 + mN - mM);
  }
}
