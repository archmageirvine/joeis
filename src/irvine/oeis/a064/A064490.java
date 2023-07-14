package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064490 Smallest prime with prime(n) decimal digits.
 * @author Sean A. Irvine
 */
public class A064490 extends A000040 {

  @Override
  public Z next() {
    return mPrime.nextPrime(Z.TEN.pow(super.next().subtract(1)));
  }
}
