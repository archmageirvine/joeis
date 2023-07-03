package irvine.oeis.a049;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A049029 Triangle read by rows, the Bell transform of the quartic factorial numbers A007696(n+1) without column 0.
 * @author Sean A. Irvine
 */
public class A049029 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m <= 0 || m > n) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(4 * (n - 1) + m).add(get(n - 1, m - 1));
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

