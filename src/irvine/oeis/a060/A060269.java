package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A060269 Distance of n-th primorial from closest prime.
 * @author Sean A. Irvine
 */
public class A060269 extends A002110 {

  private final Fast mPrime = new Fast();
  {
    setOffset(3);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z primorial = super.next();
    return mPrime.nextPrime(primorial).subtract(primorial).min(primorial.subtract(mPrime.prevPrime(primorial)));
  }
}
