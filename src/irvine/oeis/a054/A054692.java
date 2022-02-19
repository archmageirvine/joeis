package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054692 Endpoints for runs of consecutive primes mentioned in A054691.
 * @author Sean A. Irvine
 */
public class A054692 extends A054690 {

  private Z mA = super.next();

  @Override
  public Z next() {
    Z p = mA;
    do {
      mA = super.next();
    } while (p.equals(mA));
    for (int k = 1; k < mN; ++k) {
      p = mPrime.nextPrime(p);
    }
    return p;
  }
}

