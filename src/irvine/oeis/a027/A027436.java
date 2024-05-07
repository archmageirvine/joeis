package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A027436 G.f. f(x) = Sum_{n&gt;=1} a(n)*x^n satisfies f(f(x)) = x*(1 + 4*x).
 * @author Sean A. Irvine
 */
public class A027436 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    Z sum = Binomial.binomial(m, n - m).shiftLeft(2L * (n - m));
    for (int k = m + 1; k < n; ++k) {
      sum = sum.subtract(get(n, k).multiply(get(k, m)));
    }
    return sum.divide2();
  }

  @Override
  public Z next() {
    return get(++mN, 1);
  }
}
