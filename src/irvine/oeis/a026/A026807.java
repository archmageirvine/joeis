package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026807 Triangular array T read by rows: T(n,k) = number of partitions of n in which every part is &gt;=k, for k=1,2,...,n.
 * @author Sean A. Irvine
 */
public class A026807 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A026807() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 1 || m > n) {
      return Z.ZERO;
    }
    if (m.equals(n)) {
      return Z.ONE;
    }
    return get(n, m + 1).add(get(n - m, m));
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
