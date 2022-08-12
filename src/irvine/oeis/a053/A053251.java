package irvine.oeis.a053;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053251 Coefficients of the '3rd-order' mock theta function psi(q).
 * @author Sean A. Irvine
 */
public class A053251 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer i) {
    final int s = i * (i + 1) / 2;
    if (n > s) {
      return Z.ZERO;
    }
    if (n == s) {
      return Z.ONE;
    }
    return get(n, i - 1).add(get(n - i, Math.min(n - i, i - 1)));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= mN / 2; ++j) {
      sum = sum.add(get(j, Math.min(j, mN - 2 * j - 1)));
    }
    return sum;
  }
}
