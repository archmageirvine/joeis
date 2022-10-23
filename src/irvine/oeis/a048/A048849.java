package irvine.oeis.a048;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a008.A008578;

/**
 * A048849 a(n) = prime(phi(n)) + phi(prime(n)).
 * @author Sean A. Irvine
 */
public class A048849 extends Sequence0 {

  private final MemorySequence mPrime = MemorySequence.cachedSequence(new A008578());
  private int mN = 0;

  @Override
  public Z next() {
    return mPrime.a(Euler.phi(Z.valueOf(++mN)).intValueExact()).add(Euler.phi(mPrime.a(mN)));
  }
}
