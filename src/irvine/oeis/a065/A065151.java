package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a008.A008578;
import irvine.oeis.a064.A064722;
import irvine.oeis.memory.MemorySequence;

/**
 * A065151 a(n) = prime(1 + A064722(n)).
 * @author Sean A. Irvine
 */
public class A065151 extends A064722 {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());
  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return mPrimes.a(super.next().intValueExact() + 1);
  }
}

