package irvine.oeis.a387;

import irvine.math.MemoryFunctionInt5;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387987 Triangle read by rows: T(n,k) is the number of 4-dimensional balanced ballot paths of 4n steps such that the height is exactly k, 3 &lt;= k &lt;= 3*n.
 * @author Sean A. Irvine
 */
public class A387987 extends Sequence1 {

  private int mN = 1;
  private int mM = 2;

  private final MemoryFunctionInt5<Z> mB = new MemoryFunctionInt5<>() {
    @Override
    protected Z compute(final int w, final int x, final int y, final int z, final int m) {
      if (w == 0 && x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }
      Z count = Z.ZERO;
      if (w > 0 && w - 1 >= x) {
        count = count.add(get(w - 1, x, y, z, m));
      }
      if (x > 0 && x - 1 >= y && ht(w, x, y - 1, z) <= m) {
        count = count.add(get(w, x - 1, y, z, m));
      }
      if (y > 0 && y - 1 >= z && ht(w, x, y - 1, z) <= m) {
        count = count.add(get(w, x, y - 1, z, m));
      }
      if (z > 0 && ht(w, x, y, z - 1) <= m) {
        count = count.add(get(w, x, y, z - 1, m));
      }
      return count;
    }
  };

  private int ht(final int w, final int x, final int y, final int z) {
    return 3 * w - x - y - z;
  }

  @Override
  public Z next() {
    if (++mM > 3 * mN) {
      ++mN;
      mM = 3;
    }
    return mB.get(mN, mN, mN, mN, mM).subtract(mB.get(mN, mN, mN, mN, mM - 1));
  }
}

