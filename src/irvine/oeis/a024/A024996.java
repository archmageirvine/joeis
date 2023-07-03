package irvine.oeis.a024;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A024996 Triangular array, read by rows: second differences in n,n direction of trinomial array A027907.
 * @author Sean A. Irvine
 */
public class A024996 extends MemoryFunction2Sequence<Long, Z> {

  private long mM = 0;
  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 0 || m < 0 || m > 2 * n) {
      return Z.ZERO;
    } else if (n <= 2) {
      if (m == 0 || m == 2 * n) {
        return Z.ONE;
      } else if (m == 1 || m == 2 * n - 1) {
        return Z.ZERO;
      } else {
        return Z.TWO;
      }
    }
    return get(n - 1, m - 1).add(get(n - 1, m - 2).add(get(n - 1, m)));
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
