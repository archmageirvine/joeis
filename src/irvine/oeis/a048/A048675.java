package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;

/**
 * A048675 If n = p_i^e_i * ... * p_k^e_k, p_i &lt; ... &lt; p_k primes (with p_i = prime(i)), then a(n) = (1/2) * (e_i * 2^i + ... + e_k * 2^k).
 * @author Sean A. Irvine
 */
public class A048675 implements Sequence {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());
  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(Z.valueOf(fs.getExponent(p)).shiftLeft(mPrimePi.a(p.intValueExact() - 1).intValueExact()));
    }
    return sum.divide2();
  }
}

