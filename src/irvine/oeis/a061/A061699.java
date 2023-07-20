package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A061699 Generalized Bell numbers.
 * @author Sean A. Irvine
 */
public class A061699 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0 || n == 2) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sum(0, n - 2, k -> Binomial.binomial(n - 1, k).multiply(Binomial.binomial(n, k).square()).multiply(a(k)));
  }
}

