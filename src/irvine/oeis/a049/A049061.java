package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A049061 Triangle a(n,k) (1&lt;=k&lt;=n) of "signed Eulerian numbers" read by rows.
 * @author Sean A. Irvine
 */
public class A049061 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A049061() {
    super(1);
  }

  // After Jean-Fran&ccedil;ois Alcover

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ZERO;
    }
    if (n == 1 && m == 1) {
      return Z.ONE;
    }
    if ((n & 1) == 0) {
      return get(n - 1, m).subtract(get(n - 1, m - 1));
    } else {
      return get(n - 1, m).multiply(m).add(get(n - 1, m - 1).multiply(n - m + 1));
    }
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
