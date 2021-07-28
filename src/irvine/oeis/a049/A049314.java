package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049314 The number k(GL(n,q)) of conjugacy classes in GL(n,q), q=4.
 * @author Sean A. Irvine
 */
public class A049314 extends MemoryFunction1<Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;

  protected Z q() {
    return Z.FOUR;
  }

  private final MemoryFunction1<Z> mB = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (final Z d : Cheetah.factor(n).divisors()) {
        sum = sum.add(Cheetah.factor(d).phi().multiply(q().pow(n / d.intValueExact())));
      }
      return sum.divide(n).subtract(1);
    }
  };

  @Override
  protected Z compute(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      Z s = Z.ZERO;
      for (final Z d : Cheetah.factor(j).divisors()) {
        s = s.add(d.multiply(mB.get(d.intValueExact())));
      }
      sum = sum.add(s.multiply(get(n - j)));
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    return get(++mN);
  }
}
