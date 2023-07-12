package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A005751 Number of matched trees with 2n nodes.
 * @author Sean A. Irvine
 */
public class A005751 extends MemoryFunction1Sequence<Z> {

  /** Construct the sequence. */
  public A005751() {
    super(1);
  }

  // After Alois P. Heinz

  private static class R2Function extends MemoryFunction1<Z> {

    @Override
    protected Z compute(final int n) {
      if (n == 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int m = 1; m < n; ++m) {
        Z t = Z.ZERO;
        for (final Z d : Jaguar.factor(n - m).divisors()) {
          t = t.add(get(d.intValueExact()).multiply(d));
        }
        sum = sum.add(t.multiply(get(m)));
      }
      return sum.multiply2().divide(n - 1);
    }
  }

  private final R2Function mR2 = new R2Function();
  private int mN = 0;

  @Override
  protected Z compute(final int n) {
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int m = 1; m < n; ++m) {
      Z t = Z.ZERO;
      for (final Z d : Jaguar.factor(n - m).divisors()) {
        t = t.add(mR2.get(d.intValueExact()).multiply(d));
      }
      sum = sum.add(t.multiply(get(m)));
    }
    return sum.divide(n - 1);
  }

  @Override
  public Z next() {
    Z t = mR2.get(++mN);
    for (int m = 1; m < mN; ++m) {
      t = t.subtract(mR2.get(m).multiply(mR2.get(mN - m)));
    }
    if ((mN & 1) == 0) {
      t = t.add(mR2.get(mN / 2));
    } else {
      t = t.add(get((mN + 1) / 2));
    }
    return t.divide2();
  }
}
