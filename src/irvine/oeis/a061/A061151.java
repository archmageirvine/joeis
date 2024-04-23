package irvine.oeis.a061;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A061151 1 + Sum_{n&gt;=1} a_n x^n = 1/Product_{n&gt;=1} (1+x^n)^prime(n).
 * @author Sean A. Irvine
 */
public class A061151 extends MemorySequence {

  private final MemoryFunction1<Z> mB = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return Integers.SINGLETON.sumdiv(n, d -> Functions.PRIME.z(d).multiply(d).multiply(((n / d) & 1) == 0 ? 1 : -1));
    }
  };

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(1, n, k -> a(n - k).multiply(mB.get(k))).divide(n);
  }
}
