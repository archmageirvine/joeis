package irvine.oeis.a008;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A008951 Array read by columns: number of partitions of n into parts of 2 kinds.
 * @author Sean A. Irvine
 */
public class A008951 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return IntegerPartition.partitions(n);
    }
    if (n >= m * (m + 1) / 2) {
      return get(n - m, m - 1).add(get(n - m, m));
    }
    return Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mM * (mM + 1) / 2 > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
