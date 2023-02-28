package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A061697 Generalized Bell numbers.
 * @author Sean A. Irvine
 */
public class A061697 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0 || n == 3) {
      return Z.ONE;
    }
    if (n <= 2) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sum(0, n - 3, k -> Binomial.binomial(n - 1, k).multiply(Binomial.binomial(n, k)).multiply(a(k)));
  }
}

