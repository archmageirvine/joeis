package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A049290 Array T(n,k) = number of subgroups of index k in free group of rank n, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A049290 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A049290() {
    super(1);
  }

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    Z sum = Z.ZERO;
    for (int k = 1; k < m; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(k).pow(n - 1).multiply(get(n, m - k)));
    }
    return Functions.FACTORIAL.z(m).pow(n - 1).multiply(m).subtract(sum);
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
