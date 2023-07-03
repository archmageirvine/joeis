package irvine.oeis.a048;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048285 Number of Dyck paths of length 2n with nondecreasing peaks.
 * @author Sean A. Irvine
 */
public class A048285 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int x, final int y, final int k, final int t) {
      if (x == 0) {
        return Z.ONE;
      }
      Z res;
      if (y > 0) {
        if (t == 1 && y > k) {
          res = Z.ZERO;
        } else {
          res = get(x - 1, y - 1, t == 1 ? y : k, 0);
        }
      } else {
        res = Z.ZERO;
      }
      if (y < x  - 1) {
        res = res.add(get(x - 1, y + 1, k, 1));
      }
      return res;
    }
  };

  @Override
  public Z next() {
    return mB.get(2 * ++mN, 0, mN, 0);
  }
}
