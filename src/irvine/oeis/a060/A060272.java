package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A060272 Distance from n^2 to closest prime.
 * @author Sean A. Irvine
 */
public class A060272 extends A000290 {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z primorial = super.next();
    return mPrime.nextPrime(primorial).subtract(primorial).min(primorial.subtract(mPrime.prevPrime(primorial)));
  }
}
