package irvine.oeis.a061;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008578;

/**
 * A061149 Smallest number whose number of divisors = n-th primorial (A002110).
 * @author Sean A. Irvine
 */
public class A061149 extends Sequence1 {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());
  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN, k -> mPrimes.a(k).pow(mPrimes.a(mN - k + 1).subtract(1)));
  }
}
