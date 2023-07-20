package irvine.oeis.a063;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A063902 a(n+1) = sum{j = 0,...n}[C(2n,2j)a(j)a(n-j)] with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A063902 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size() - 1;
    if (n < 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(2L * n, 2L * k).multiply(a(k).multiply(a(n - k))));
  }
}

