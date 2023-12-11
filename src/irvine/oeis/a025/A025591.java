package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A025591 Maximal coefficient of Product_{k&lt;=n} (1 + x^k). Number of solutions to +- 1 +- 2 +- 3 +- ... +- n = 0 or 1.
 * @author Sean A. Irvine
 */
public class A025591 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n > m * (m + 1) / 2) {
      return Z.ZERO;
    }
    if (m == 0) {
      return Z.ONE;
    }
    return get(n + m, m - 1).add(get(Math.abs(n - m), m - 1));
  }

  @Override
  public Z next() {
    return get(0L, ++mN).add(get(1L, mN));
  }
}
