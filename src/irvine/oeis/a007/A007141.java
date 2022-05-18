package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007141 E-trees with at most 2 colors.
 * @author Sean A. Irvine
 */
public class A007141 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;
  private final SFunction mS = new SFunction();

  private class SFunction extends MemoryFunction2<Integer, Z> {
    @Override
    protected Z compute(final Integer c, final Integer n) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(n).divisors()) {
        sum = sum.add(A007141.this.get(c, d.intValueExact()));
      }
      return sum;
    }
  }

  // E(c,n)
  @Override
  protected Z compute(final Integer c, final Integer n) {
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int i = 1; i < n; ++i) {
      sum = sum.add(get(c, n - i).multiply(mS.get(c, i)).multiply((c + 1) * i - n + 1));
    }
    return sum.divide(n - 1);
  }

  @Override
  public Z next() {
    return get(2, ++mN);
  }
}
