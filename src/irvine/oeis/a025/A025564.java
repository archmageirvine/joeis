package irvine.oeis.a025;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025564 Triangular array, read by rows: pairwise sums of trinomial array A027907.
 * @author Sean A. Irvine
 */
public class A025564 extends MemoryFunction2<Long, Z> implements Sequence {

  private static final Z[] N2 = {Z.ONE, Z.THREE, Z.FOUR, Z.THREE, Z.ONE};
  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > 2 * n) {
      return Z.ZERO;
    }
    if (n <= 2) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return m == 1 ? Z.TWO : Z.ONE;
      }
      return N2[m.intValue()];
    }
    return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
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
