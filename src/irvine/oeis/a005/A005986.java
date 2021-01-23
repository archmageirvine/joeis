package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005986 Number of column-strict plane partitions of n.
 * @author Sean A. Irvine
 */
public class A005986 extends MemoryFunction1<Z> implements Sequence {

  private int mN = -1;

  @Override
  protected Z compute(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      Z s = Z.ZERO;
      for (final Z d : Cheetah.factor(j).divisors()) {
        s = s.add(d.multiply((d.intValue() + 3) / 2));
      }
      sum = sum.add(s.multiply(get(n - j)));
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN);
  }

}
