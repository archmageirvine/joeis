package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;
import irvine.oeis.a008.A008578;
import irvine.oeis.memory.MemorySequence;

/**
 * A065309 a(n) = prime(n) - prime(n - pi(n)).
 * @author Sean A. Irvine
 */
public class A065309 extends A000720 {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());

  @Override
  public Z next() {
    final Z pi = super.next();
    return mPrimes.a(mN.intValueExact()).subtract(mPrimes.a(mN.subtract(pi).intValueExact()));
  }
}
