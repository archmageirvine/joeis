package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007182 Dimension of n-th compound of a certain space.
 * @author Sean A. Irvine
 */
public class A007182 extends MemoryFunction1<Z> implements Sequence {

  private int mN = -2;

  @Override
  protected Z compute(final int n) {
    if (n <= 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      Z t = Z.ONE;
      for (final Z d : Cheetah.factor(j).divisors()) {
        if (d.compareTo(Z.ONE) > 0 && d.isEven()) {
          t = t.add(get(d.divide2().intValueExact()).multiply(d));
        }
      }
      sum = sum.add(t.multiply(get(n - j)));
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    mN += 2;
    return get(mN);
  }
}
