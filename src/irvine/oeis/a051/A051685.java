package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A051685 Auxiliary sequence for calculation of number of even permutations of degree n and order exactly 4.
 * @author Sean A. Irvine
 */
public class A051685 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A051685() {
    super(1);
  }

  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0 && m == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      Z s = Z.ZERO;
      for (int l = 1; l <= m; ++l) {
        if (Functions.LCM.i(l, k) == m) {
          s = s.add(get(n - k, l));
        }
      }
      sum = sum.signedAdd((k & 1) == 1, s.multiply(Functions.FACTORIAL.z(n - 1).divide(Functions.FACTORIAL.z(n - k))));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 4);
  }
}
