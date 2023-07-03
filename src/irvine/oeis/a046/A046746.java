package irvine.oeis.a046;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A046746 Sum of smallest parts of all partitions of n.
 * @author Sean A. Irvine
 */
public class A046746 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    Z r = n.equals(m) ? Z.valueOf(n) : Z.ZERO;
    if (m >= 1) {
      r = r.add(get(n, m - 1));
      if (n >= m) {
        r = r.add(get(n - m, m));
      }
    }
    return r;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
