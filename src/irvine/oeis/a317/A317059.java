package irvine.oeis.a317;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A317059 a(n) is the number of time-dependent assembly trees satisfying the edge gluing rule for a complete graph on n vertices.
 * @author Gregory Morse
 */
public class A317059 extends Sequence1 {
  private int mN = 0;
  private final MemoryFunction1<Z> mA = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n <= 2) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 1; k <= n / 2; ++k) {
        sum = sum.add(Binomial.binomial(n, 2 * k).multiply(Functions.MULTIFACTORIAL.z(2, 2 * k - 1)).multiply(get(n - k)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mA.get(++mN);
  }
}
