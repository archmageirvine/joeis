package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026833 Number of partitions of n into distinct parts, the least being even.
 * @author Sean A. Irvine
 */
public class A026833 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n <= 0 || m * (m + 1) < 2 * n) {
      return Z.ZERO;
    }
    Z t = get(n, m - 1);
    if (m.equals(n) && (m & 1) == 0) {
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
