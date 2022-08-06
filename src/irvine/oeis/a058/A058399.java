package irvine.oeis.a058;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058399 Triangle of partial row sums of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A058399 extends MemoryFunctionInt2<Z> implements Sequence {
  
  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  
  @Override
  protected Z compute(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sum(0, n / m, k -> get(n - k * m, m - 1));
  }

  private Z t(final int n, final int m) {
    return get(n, n).subtract(get(n, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

