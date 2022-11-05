package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A060270 Distance of n-th primorial from previous prime.
 * @author Sean A. Irvine
 */
public class A060270 extends A002110 {

  private final Fast mPrime = new Fast();
  {
    setOffset(2);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z primorial = super.next();
    return primorial.subtract(mPrime.prevPrime(primorial));
  }
}
