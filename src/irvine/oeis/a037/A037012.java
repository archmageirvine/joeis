package irvine.oeis.a037;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A037012 Triangle read by rows; row 0 is 0; the n-th row for n&gt;0 contains the coefficients in the expansion of (1-x)*(1+x)^(n-1).
 * @author Sean A. Irvine
 */
public class A037012 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 || m > n || m < 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return m == 0 ? Z.ONE : Z.NEG_ONE;
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
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
