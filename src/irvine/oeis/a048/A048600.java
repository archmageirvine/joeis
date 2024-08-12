package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048600 Array a(n,k) = number of colors that can be produced by n units of paint from k primary colors, read by descending antidiagonals.
 * @author Sean A. Irvine
 */
public class A048600 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A048600() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      final int mobius = Functions.MOBIUS.i(n / d.intValueExact());
      if (mobius != 0) {
        Z prod = Z.ONE;
        for (int j = 1; j <= k; ++j) {
          prod = prod.multiply(d.add(j));
        }
        sum = sum.signedAdd(mobius == 1, prod.divide(Functions.FACTORIAL.z(k)));
      }
    }
    return sum;
  }

  private Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      sum = sum.add(get(j, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}

