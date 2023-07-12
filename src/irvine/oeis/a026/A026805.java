package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026805 Number of partitions of n in which the least part is even.
 * @author Sean A. Irvine
 */
public class A026805 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A026805() {
    super(1);
  }

  // After Alois P. Heinz

  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 1 || m < 1) {
      return Z.ZERO;
    }
    Z t = get(n, m - 1);
    if (n.equals(m)) {
      t = t.add(1 - (n & 1));
    }
    if (m <= n) {
      t = t.add(get(n - m, m));
    }
    return t;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
