package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A061775 Number of nodes in rooted tree with Matula-Goebel number n.
 * @author Sean A. Irvine
 */
public class A061775 extends MemorySequence {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    add(null); // 0th unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    if (mPrime.isPrime(n)) {
      return a((int) Puma.primePi(n)).add(1);
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ONE;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(a(p.intValueExact()).subtract(1).multiply(fs.getExponent(p)));
    }
    return sum;
  }
}
