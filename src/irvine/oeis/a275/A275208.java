package irvine.oeis.a275;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A275208 Expansion of (A(x)^2-A(x^2))/2 where A(x) = A001006(x).
 * Cf. A275207.
 * @author Georg Fischer
 */
public class A275208 extends Sequence0 {

  private int mN = -1;

  private final MemoryFunction1<Z> mB = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.ONE;
      }
      return get(n - 2).multiply(3L * (n - 1)).add(get(n - 1).multiply(2L * n + 1)).divide(n + 2);
    }
  };

  private final MemoryFunction1<Z> mA = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      Z sum = Z.ZERO;
      final int jmax = n / 2;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(mB.get(j).multiply(mB.get(n - j)));
      }
      if ((n & 1) != 1) {
        final Z t = mB.get(n / 2);
        sum = sum.subtract(t.multiply(t.add(+1)).divide2());
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mA.get(++mN);
  }
}
