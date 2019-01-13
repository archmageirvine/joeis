package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008951.
 * @author Sean A. Irvine
 */
public class A008951 extends MemoryFunction2<Integer, Z> implements Sequence {

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
