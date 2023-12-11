package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A049604 Array T read by diagonals: T(i,j)=least number of knight's moves on unbounded chessboard from corner (0,0) to square (i,j).
 * @author Sean A. Irvine
 */
public class A049604 extends MemoryFunction2Sequence<Long, Z> {

  // After Yu-Sheng Chang

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k == 0) {
      return n == 1 ? Z.THREE : Z.valueOf(2 * (n / 4) + (n & 3));
    }
    if (k == 1) {
      final long x = n - k + 1;
      if (x <= 2) {
        return x == 1 ? Z.THREE : Z.FOUR;
      } else {
        return Z.valueOf(2 * ((n + 1) / 4) - 1 + ((n + 1) & 3));
      }
    }
    if (n < 2 * k) {
      return get(n, n - k);
    }
    return get(n - 3, k - 2).min(get(n - 3, k - 1)).add(1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
