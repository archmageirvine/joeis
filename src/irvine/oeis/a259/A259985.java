package irvine.oeis.a259;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A259985 Triangle read by rows: coefficients of rook polynomials.
 * @author Sean A. Irvine
 */
public class A259985 extends MemoryFunction2<Long, Z> implements Sequence {

  // Rook polynomials

  private static final long[][] SMALL = {
    {1},
    {1, 1},
    {1, 4, 2},
    {1, 9, 18, 6},
    {1, 16, 72, 96, 24},
    {1, 20, 130, 320, 265, 44},
    {1, 24, 204, 752, 1185, 672, 80},
    {1, 28, 294, 1456, 3521, 3892, 1617, 144},
    {1, 32, 400, 2496, 8264, 14272, 11776, 3776, 264},
    {1, 36, 522, 3936, 16659, 39924, 52071, 33480, 8577, 484},
    {1, 40, 660, 5840, 30210, 93568, 171060, 175360, 90745, 19080, 888},
    {1, 44, 814, 8272, 50677, 193556, 461208, 667832, 554532, 236808, 41745, 1632}
  };

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k > n || k < 0) {
      return Z.ZERO;
    }
    if (n < SMALL.length) {
      return Z.valueOf(SMALL[n.intValue()][k.intValue()]);
    }
    return get(n - 1, k)
      .add(get(n - 1, k - 1).multiply(4))
      .subtract(get(n - 2, k - 2).multiply(4))
      .subtract(get(n - 3, k - 2))
      .subtract(get(n - 4, k - 2))
      .subtract(get(n - 4, k - 3).multiply(4))
      .subtract(get(n - 4, k - 4).multiply2())
      .add(get(n - 5, k - 4).multiply(3))
      .add(get(n - 5, k - 5).multiply(4))
      .add(get(n - 7, k - 6))
      .subtract(get(n - 8, k - 8));
  }

  private long mN = -1;
  private long mR = 0;

  @Override
  public Z next() {
    if (++mR > mN) {
      ++mN;
      mR = 0;
    }
    return get(mN, mR);
  }
}
