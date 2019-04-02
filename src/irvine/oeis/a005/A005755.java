package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005755 Number of identity matched trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005755 extends MemoryFunction1<Z> implements Sequence {

  // After Alois P. Heinz

  private static class BFunction extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int m = 1; m < n; ++m) {
        Z t = Z.ZERO;
        for (final Z d : Cheetah.factor(n - m).divisors()) {
          final int dd = d.intValueExact();
          t = t.signedAdd((((n - m) / dd) & 1) == 1, get(dd).multiply(d));
        }
        sum = sum.add(t.multiply(get(m)));
      }
      return sum.multiply2().divide(n - 1);
    }
  }

  private final BFunction mB2 = new BFunction();
  private int mN = 0;

  @Override
  protected Z compute(final int n) {
    if (n <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int m = 1; m < n; ++m) {
      Z t = Z.ZERO;
      for (final Z d : Cheetah.factor(n - m).divisors()) {
        final int dd = d.intValueExact();
        t = t.signedAdd((((n - m) / dd) & 1) == 1, mB2.get(dd).multiply(d));
      }
      sum = sum.add(t.multiply(get(m)));
    }
    return sum.divide(n - 1);
  }

  @Override
  public Z next() {
    Z t = mB2.get(++mN);
    for (int m = 1; m < mN; ++m) {
      t = t.subtract(mB2.get(m).multiply(mB2.get(mN - m)));
    }
    if ((mN & 1) == 0) {
      t = t.subtract(mB2.get(mN / 2));
    } else {
      t = t.subtract(get((mN + 1) / 2));
    }
    return t.divide2();
  }
}
