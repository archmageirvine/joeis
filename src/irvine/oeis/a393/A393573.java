package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393573 Triangle read by rows, T(n, k) is the number of 3-dimensional balanced ballot paths of 3n steps and semisymmetric height of exactly 2k, where the semisymmetric height of point (x_1, x_2, x_3, x_4) is defined as h_3'(x) = 2*x_1 - 2*x_3 for 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A393573 extends Sequence1 {

  private int mN = 1;
  private int mM = 0;

  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int x, final int y, final int z, final int m) {
      if (x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }
      Z count = Z.ZERO;
      if (x > 0 && x - 1 >= y) {
        count = count.add(get(x - 1, y, z, m));
      }
      if (y > 0 && y - 1 >= z && ht(x, z) <= m) {
        count = count.add(get(x, y - 1, z, m));
      }
      if (z > 0 && ht(x, z - 1) <= m) {
        count = count.add(get(x, y, z - 1, m));
      }
      return count;
    }
  };

  private int ht(final int x, final int z) {
    return 2 * x - 2 * z;
  }

  @Override
  public Z next() {
    mM += 2;
    if (mM > 2 * mN) {
      ++mN;
      mM = 2;
    }
    return mB.get(mN, mN, mN, mM).subtract(mM == 2 ? Z.ZERO : mB.get(mN, mN, mN, mM - 2));
  }
}

