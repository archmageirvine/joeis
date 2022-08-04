package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a049.A049081;

/**
 * A058322 Primes for which A049076(p) = 7.
 * @author Sean A. Irvine
 */
public class A058322 extends A049081 {

  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    while (t > mN) {
      mP = mPrime.nextPrime(mP);
      ++mN;
    }
    return mP;
  }
}

