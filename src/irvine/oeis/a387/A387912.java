package irvine.oeis.a387;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387912 Triangle read by rows: T(n,k) is the number of 3-dimensional balanced ballot paths of 3n steps such that the height is exactly k, 2 &lt;= k &lt;= 2*n.
 * @author Sean A. Irvine
 */
public class A387912 extends Sequence1 {

  private int mN = 1;
  private int mM = 1;

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
      if (y > 0 && y - 1 >= z && ht(x, y - 1, z) <= m) {
        count = count.add(get(x, y - 1, z, m));
      }
      if (z > 0 && ht(x, y, z - 1) <= m) {
        count = count.add(get(x, y, z - 1, m));
      }
      return count;
    }
  };

  private int ht(final int x, final int y, final int z) {
    return 2 * x - y - z;
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 2;
    }
    return mB.get(mN, mN, mN, mM).subtract(mB.get(mN, mN, mN, mM - 1));
  }
}

