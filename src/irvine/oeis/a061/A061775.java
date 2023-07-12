package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000720;

/**
 * A061775 Number of nodes in rooted tree with Matula-Goebel number n.
 * @author Sean A. Irvine
 */
public class A061775 extends MemorySequence {

  private final Fast mPrime = new Fast();
  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new PrependSequence(new A000720(), 0));

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
      return a(mPrimePi.a(n).intValueExact()).add(1);
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ONE;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(a(p.intValueExact()).subtract(1).multiply(fs.getExponent(p)));
    }
    return sum;
  }
}
