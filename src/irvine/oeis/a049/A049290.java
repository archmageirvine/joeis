package irvine.oeis.a049;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049290 Array T(n,k) = number of subgroups of index k in free group of rank n, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A049290 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    Z sum = Z.ZERO;
    for (int k = 1; k < m; ++k) {
      sum = sum.add(mF.factorial(k).pow(n - 1).multiply(get(n, m - k)));
    }
    return mF.factorial(m).pow(n - 1).multiply(m).subtract(sum);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN + 1 - mM, mM);
  }
}
