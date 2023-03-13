package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A061898 Swap each prime in factorization of n with "neighbor" prime.
 * @author Sean A. Irvine
 */
public class A061898 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new PrependSequence(new A000720(), 0));
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (mPrimePi.a(p.intValueExact()).isOdd()) {
        prod = prod.multiply(mPrime.nextPrime(p).pow(e));
      } else {
        prod = prod.multiply(mPrime.prevPrime(p).pow(e));
      }
    }
    return prod;
  }
}
