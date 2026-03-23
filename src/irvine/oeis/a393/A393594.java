package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt5;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393594 Triangle read by rows: T(n, k) is the number of 4-dimensional balanced ballot paths of 4n steps and symmetric height exactly k.
 * @author Sean A. Irvine
 */
public class A393594 extends Sequence1 {

  private int mN = 1;
  private int mM = 3;

  /*
def f(t, bd):
    count = 0
    if t == (0, 0, 0, 0):
        return 1
    if t[0] > 0 and t[0] - 1 >= t[1]:
        count += f((t[0] - 1, t[1], t[2], t[3]), bd)
    if t[1] > 0 and t[1] - 1 >= t[2] and ht((t[0], t[1] - 1, t[2], t[3])) <= bd:
        count += f((t[0], t[1] - 1, t[2], t[3]), bd)
    if t[2] > 0 and t[2] - 1 >= t[3] and ht((t[0], t[1], t[2] - 1, t[3])) <= bd:
        count += f((t[0], t[1], t[2] - 1, t[3]), bd)
    if t[3] > 0 and ht((t[0], t[1], t[2], t[3] - 1)) <= bd:
        count += f((t[0], t[1], t[2], t[3] -1), bd)
    return count
   */

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
      if (x > 0 && x - 1 >= y && ht(w, x - 1, y, z) <= m) {
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
    return 3 * w + x - y - 3 * z;
  }

  @Override
  public Z next() {
    if (++mM > 4 * mN) {
      ++mN;
      mM = 4;
    }
    return mB.get(mN, mN, mN, mN, mM).subtract(mB.get(mN, mN, mN, mN, mM - 1));
  }
}

