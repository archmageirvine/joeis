package irvine.oeis.a174;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174411 Triangle read by rows: T(n,k) = c(n) / c(max(k, n-k)) where c(n) = Product_{i=1..n} F(i)*F(i+1) and F(i) the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A174411 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunction1<Z> mC = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return Integers.SINGLETON.product(1, n, k -> Functions.FIBONACCI.z(k).multiply(Functions.FIBONACCI.z(k + 1)));
    }
  };

  private Z t(final int n, final int m) {
    return mC.get(n).divide(mC.get(Math.max(n - m, m)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
