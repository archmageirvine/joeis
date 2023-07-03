package irvine.oeis.a011;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A011801 Triangle read by rows, the inverse Bell transform of n!*binomial(4,n) (without column 0).
 * @author Sean A. Irvine
 */
public class A011801 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < m || m == 0) {
      return Z.ZERO;
    }
    if (n == 1 && m == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(5 * (n - 1) - m).add(get(n - 1, m - 1));
  }

 @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
