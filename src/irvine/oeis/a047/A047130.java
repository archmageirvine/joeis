package irvine.oeis.a047;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047130 Array read by descending antidiagonals: T(h,k) is the number of paths consisting of steps from (0,0) to (h,k) such that each step has length 1 directed up or right and no up-step crosses the line y = 3x/4. (Thus a path crosses the line only at lattice points and on right-steps.).
 * @author Sean A. Irvine
 */
public class A047130 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 || m == 0) {
      return Z.ONE;
    }
    Z s = get(n - 1, m);
    if (3 * n != 4 * m - 3 && 3 * n != 4 * m - 2 && 3 * n != 4 * m - 1) {
      s = s.add(get(n, m - 1));
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}
