package irvine.oeis.a026;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A026832 Number of partitions of n into distinct parts, the least being odd.
 * @author Sean A. Irvine
 */
public class A026832 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n <= 0 || m * (m + 1) < 2 * n) {
      return Z.ZERO;
    }
    Z t = get(n, m - 1);
    if ((m & 1) == 1 && m.equals(n)) {
      t = t.add(1);
    } else if (m < n) {
      t = t.add(get(n - m, Math.min(n - m, m - 1)));
    }
    return t;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
