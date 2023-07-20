package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A048767 If n = Product (p_j^k_j) then a(n) = Product ( prime(k_j)^pi(p_j) ) where pi is A000720.
 * @author Sean A. Irvine
 */
public class A048767 extends Sequence1 {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A000040());
  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000720());
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mPrimes.a(fs.getExponent(p) - 1).pow(mPi.a(p.intValueExact() - 1)));
    }
    return prod;
  }
}
