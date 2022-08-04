package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058327 Primes for which A049076(p) = 11.
 * @author Sean A. Irvine
 */
public class A058327 extends A058326 {

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

