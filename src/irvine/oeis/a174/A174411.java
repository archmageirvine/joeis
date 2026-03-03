package irvine.oeis.a174;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A174411 A product triangle sequence based on:a=1;f(n, a) = f(n - 1, a) + a*f(n - 2, a); c(n,a)=If[n == 0, 1, Product[f(i, a)*f(i + 1, a), {i, 1, n}]]; t(n,m,a)=If[Floor[n/2] &gt;= m, c(n, a)/c(n - m, a), c(n, a)/c(m, a)].
 * @author Sean A. Irvine
 */
public class A174411 extends Sequence1 {

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
